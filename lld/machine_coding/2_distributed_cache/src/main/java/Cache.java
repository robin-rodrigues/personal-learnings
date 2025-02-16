import models.*;
import models.Record;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cache<KEY, VALUE> {

    private Map<KEY, Record<VALUE>> map;
    private DataSource<KEY, VALUE> dataSource;
    private final PersistenceAlgorithm persistenceAlgorithm;
    private final EvictionAlgorithm evictionAlgorithm;
    private final Integer expiryTimeInMillis;
    private final Map<Long, List<Record<VALUE>>> expiryQueue;
    private final Map<AccessDetails, List<Record<VALUE>>> priorityQueue;
    private static final Integer THRESHOLD_SIZE = 500;

    public Cache(DataSource<KEY, VALUE> dataSource, PersistenceAlgorithm persistenceAlgorithm, EvictionAlgorithm evictionAlgorithm, Integer expiryTimeInSeconds) {
        this.dataSource = dataSource;
        this.persistenceAlgorithm = persistenceAlgorithm;
        this.evictionAlgorithm = evictionAlgorithm;
        this.expiryTimeInMillis = expiryTimeInSeconds;
        this.map = new ConcurrentHashMap<>();
        this.expiryQueue = new ConcurrentSkipListMap<>();
        this.priorityQueue = new ConcurrentSkipListMap<>((first, second) -> {
            final var older = (int) (first.getAccessTimestamp() - second.getAccessTimestamp());
            if(evictionAlgorithm.equals(EvictionAlgorithm.LRU)) {
                return older;
            } else {
                return first.getAccessCount() == second.getAccessCount() ? older : first.getAccessCount() - second.getAccessCount();
            }
        });
    }

    public CompletableFuture<VALUE> get(KEY key) {
        final CompletableFuture<Record<VALUE>> result;
        if(map.containsKey(key) && map.get(key).getAccessDetails().getAccessTimestamp()
                >= System.currentTimeMillis() - expiryTimeInMillis) {
            result = CompletableFuture.completedFuture(map.get(key));
        } else {
            result = dataSource.get(key).thenApply(value -> addToCache(key, value));
        }
        return result.thenApply(record -> {
            final var accessDetails = record.getAccessDetails();
            accessDetails.setAccessCount(accessDetails.getAccessCount() + 1);
            accessDetails.setAccessTimestamp(System.currentTimeMillis());
            priorityQueue.putIfAbsent(accessDetails, new CopyOnWriteArrayList<>());
            priorityQueue.get(accessDetails).add(record);
            return record.getValue();
        });
    }

    public CompletableFuture<Void> set(KEY key, VALUE value) {
        if(!map.containsKey(key) && map.size() >= THRESHOLD_SIZE) {
            // LRU, LFU
            if(evictionAlgorithm.equals(EvictionAlgorithm.LRU)) {

            } else {

            }
        }

        if(evictionAlgorithm.equals(PersistenceAlgorithm.WRITE_THROUGH)) {
            return dataSource.persist(key, value)
                    .thenAccept(__-> addToCache(key, value));
        } else {
            addToCache(key, value);
            dataSource.persist(key, value);
            return CompletableFuture.completedFuture(null);
        }
    }

    private Record<VALUE> addToCache(KEY key, VALUE value) {
        Record<VALUE> valueRecord = new Record<>(value);
        final var currentTime = System.currentTimeMillis();
        expiryQueue.putIfAbsent(currentTime, new CopyOnWriteArrayList<>());
        expiryQueue.get(currentTime).add(valueRecord);
        map.put(key, valueRecord);
        return map.get(key);
    }
}



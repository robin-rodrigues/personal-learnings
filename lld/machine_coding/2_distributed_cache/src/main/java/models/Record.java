package models;

public class Record<VALUE> implements Comparable<Record<VALUE>> {
    private final VALUE value;
    private long loadTime;
    private final AccessDetails accessDetails;

    public Record(VALUE value) {
        this.value = value;
        this.accessDetails = new AccessDetails();
    }

    @Override
    public int compareTo(Record record) {
        return (int) (accessDetails.accessTimestamp - record.accessDetails.accessTimestamp);
    }

    public VALUE getValue() {
        return value;
    }

    public AccessDetails getAccessDetails() {
        return accessDetails;
    }
}

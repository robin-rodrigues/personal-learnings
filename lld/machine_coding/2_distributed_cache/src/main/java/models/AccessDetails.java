package models;

public class AccessDetails {
    private long accessTimestamp;
    private int accessCount;

    public long getAccessTimestamp() {
        return accessTimestamp;
    }

    public int getAccessCount() {
        return accessCount;
    }

    public void setAccessTimestamp(long accessTimestamp) {
        this.accessTimestamp = accessTimestamp;
    }

    public void setAccessCount(int accessCount) {
        this.accessCount = accessCount;
    }
}

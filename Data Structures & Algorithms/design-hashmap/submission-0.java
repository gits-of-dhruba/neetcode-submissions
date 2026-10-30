class MyHashMap {

    // Helper class needs to be static or non-static with proper instance fields
    private class Entry {
        int key;
        int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int BUCKET_SIZE = 769;
    private LinkedList<Entry>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[BUCKET_SIZE];
        for (int i = 0; i < BUCKET_SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    private int hash(int key) {
        return Integer.hashCode(key) % BUCKET_SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Entry> bucket = buckets[index];
        
        // Check if key already exists, update value if found
        for (Entry entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        
        // Otherwise, add new entry
        bucket.add(new Entry(key, value));
    }
    
    public int get(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = buckets[index];
        
        for (Entry entry : bucket) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        
        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = buckets[index];
        
        Entry target = null;
        for (Entry entry : bucket) {
            if (entry.key == key) {
                target = entry;
                break;
            }
        }
        if (target != null) {
            bucket.remove(target);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
package ik.ds;

public class MyHashTable {
    private int INIT_SIZE = 16;
    private HashEntry[] data;
    private int size;

    private static class HashEntry {
        private String key;
        private String value;
        private HashEntry next;
        private HashEntry head;

        HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public MyHashTable() {
        data = new HashEntry[INIT_SIZE];
    }

    public void put(String key, String value) {
        int id = getId(key);
        HashEntry newEntry = new HashEntry(key, value);
        if (data[id] == null) {
            data[id] = newEntry;
        } else {
            HashEntry entry = data[id];
            while (entry.next != null) {
                entry = entry.next;
            }
            entry.next = newEntry;
        }
        size++;
    }

    public String get(String key) {
        int id = getId(key);
        if (data[id] != null) {
            HashEntry entry = data[id];
            if (entry.next == null) {
                // no collision scenario
                return entry.value;
            } else {
                while (entry != null) {
                    if (entry.key.equals(key)) {
                        return entry.value;
                    }
                    entry = entry.next;
                }
            }
        }
        size++;
        return "NOTHING_HERE";
    }

    private int getId(String key) {
        int hash = key.hashCode();
        return Math.abs(hash % INIT_SIZE);
    }
}


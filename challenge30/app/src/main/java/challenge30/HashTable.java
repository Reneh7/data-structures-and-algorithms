package challenge30;

import java.util.LinkedList;

public class HashTable <K, V> {
    private static final int DEFAULT_CAPACITY = 100;
    private LinkedList<Entry<K, V>>[] table;
    public int capacity;

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void set(K key, V value) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public boolean has(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }

        return false;
    }

    public Iterable<K> keys() {
        LinkedList<K> keys = new LinkedList<>();

        for (LinkedList<Entry<K, V>> bucket : table) {
            for (Entry<K, V> entry : bucket) {
                keys.add(entry.getKey());
            }
        }

        return keys;
    }

    public int hash(K key) {
        return key.hashCode() % capacity;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}

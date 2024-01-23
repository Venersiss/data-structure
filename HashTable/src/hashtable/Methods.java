/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashtable;
import java.util.LinkedList;


 class KeyValue<K, V> {
    K key;
    V value;

    public KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }
}


class Methods <K, V> {
    private static final int DEFAULT_CAPACITY = 10;
    private LinkedList<KeyValue<K, V>>[] table;
    private int size;

    public Methods() {
        this(DEFAULT_CAPACITY);
    }

    public Methods(int capacity) {
        table = new LinkedList[capacity];
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % table.length);
    }

    public void put(K key, V value) {
        int index = hash(key);

        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (KeyValue<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                // Update value if the key already exists
                entry.value = value;
                return;
            }
        }

        // Add a new key-value pair
        table[index].add(new KeyValue<>(key, value));
        size++;

        // Optionally, you can check if it's time to resize the table based on load factor
        // and rehash the keys if necessary.
    }

    public V get(K key) {
        int index = hash(key);

        if (table[index] != null) {
            for (KeyValue<K, V> entry : table[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }

        // Key not found
        return null;
    }

    public void remove(K key) {
        int index = hash(key);

        if (table[index] != null) {
            table[index].removeIf(entry -> entry.key.equals(key));
            size--;

            // Optionally, you can check if it's time to resize the table based on load factor
            // and rehash the keys if necessary.
        }
    }

    public int size() {
        return size;
    }
}

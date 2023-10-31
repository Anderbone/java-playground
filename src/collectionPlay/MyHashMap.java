package collectionPlay;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;

public class MyHashMap {
    LinkedList<Pair>[] m;

    public MyHashMap() {
        m = new LinkedList[2069];
        Arrays.fill(m, new LinkedList<>());
    }

    public int hash(int k) {
        return k % 2069;
    }

    public void put(int key, int value) {
//        for (Pair p : m[hash(key)]) {
//            if ((int) p.k == key) {
//                p.v = value;
//                return;
//            }
//        }
//        m[hash(key)].offer(new Pair(key, value));
        m[hash(key)].stream().filter(p -> (int) p.k == key).findFirst().map(p -> p.v = value)
                .or(() -> Optional.of(m[hash(key)].offer(new Pair(key, value))));
    }

    public int get(int key) {
//        for (Pair p : m[hash(key)]) {
//            if ((int) p.k == key) {
//                return (int) p.v;
//            }
//        }
        return (int) m[hash(key)].stream().filter(p -> (int) p.k == key).findFirst().map(p -> p.v).orElse(-1);
//        return -1;
    }

    public void remove(int key) {
//        for (Pair p : m[hash(key)]) {
//            if ((int) p.k == key) {
//                m[hash(key)].remove(p);
//                break;
//            }
//        }
        int toRemove = (int) m[hash(key)].stream().filter(p -> (int) p.k == key).findFirst().get().k;
        m[hash(key)].remove(toRemove);
    }
}

class Pair<K, V> {
    public K k;
    public V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }
}

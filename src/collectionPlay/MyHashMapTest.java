package collectionPlay;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class MyHashMapTest {
    private static Map<Integer, Integer> m = new HashMap<>();

    @BeforeClass
    public static void init(){
        m.put(1, 2);
        m.put(3, 3);
        m.put(3, 4);
        m.put(4, 8);
        m.put(5, 10);
    }

    @Test
    public void put() {
        System.out.println(m.get(3));
        System.out.println(m.toString());
    }

    @Test
    public void get() {
        assertEquals(4l, (long) m.get(3));
    }

    @Test
    public void remove() {
        int startSize = m.size();
        int key = m.keySet().stream().findFirst().get();
        m.remove(key);
        assertEquals(startSize - 1, m.size());
    }
}
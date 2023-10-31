package collectionPlay;

import java.util.HashMap;
import java.util.Map;

public class MapPlay {
    private static HashMap<Integer, String> m = new HashMap<>();
    private static Map<Integer, String> m2;
    public static void main(String[] args) {
        initMap();


    }

    private static void initMap() {
        m.put(2, "he");
        m.put(3, "she");
        m.put(4, "tom");
        m.put(5, "jack");
        m.put(7, "mary");
        m2 = Map.of(2, "a", 3, "b");
        m2.keySet().stream().forEach(System.out::println);
    }
}

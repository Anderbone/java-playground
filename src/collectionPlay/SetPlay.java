package collectionPlay;

import java.util.HashSet;

public class SetPlay {
    private static HashSet<Integer> s1;
    private static HashSet<Integer> s2;
    public static void main(String[] args) {
        initMySet();
    }


    private static void initMySet() {
        s1 = new HashSet<>();
        s2 = new HashSet<>();
        s1.add(2);
        s1.add(2);
        s1.add(3);
        s1.add(56);
        s2.addAll(s1);
        s2.add(88);
        s2.remove(3);
        s1.retainAll(s2);
        System.out.println(s1);
    }
}

package collectionPlay;

import java.util.ArrayList;
import java.util.List;

public class ListPlay {
    public static List<Integer> myList = new ArrayList<>();

    public static void main(String[] args) {
        initList();
        List<Integer> sub = myList.subList(2, 3);
        System.out.println(sub);

    }

    public static void initList() {
        myList.add(1);
        myList.add(3);
        myList.add(4);
        myList.add(8);
    }
}

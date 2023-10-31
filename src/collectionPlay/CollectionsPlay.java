package collectionPlay;

import java.util.Collections;

import static collectionPlay.ListPlay.myList;

public class CollectionsPlay {
    public static void main(String[] args) {
        collectionPlay();
    }

    private static void collectionPlay() {
        ListPlay.initList();
        int result = Collections.binarySearch(myList, 8);
        System.out.println(myList);
        Collections.swap(myList, 0, 1);
        System.out.println(myList);
        Collections.min(myList);
        System.out.println(myList);
    }
}

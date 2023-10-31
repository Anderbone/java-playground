package collectionPlay;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueuePlay {
    static Queue<int[]> myQueue = new ArrayDeque<>();
    public static void main(String[] args) {
        initMyQueue();
    }

    private static void initMyQueue() {
        myQueue.offer(new int[]{1,2,3});
        myQueue.stream().map(a -> Arrays.toString(a)).forEach(System.out::println);
    }
}

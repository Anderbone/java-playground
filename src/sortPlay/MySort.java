package sortPlay;

import java.util.Arrays;
import java.util.Random;

public class MySort {
    private static int[] arr = new int[]{2, 4, 5, 8, 1, 10};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSortInternal(int[] array, int l, int r) {
        if (l >= r) return;
        Random random = new Random();
        int pIndex = l + random.nextInt((r - l) + 1);
        int temp0 = array[pIndex];
        array[pIndex] = array[r];
        array[r] = temp0;
        int start = l;
        for (int i = start; i < r; i++){
            if (array[i] < array[r]){
                int temp1 = array[i];
                array[i] = array[l];
                array[l] = temp1;
                l++;
            }
        }
        /* swap the smaller with pivot */
        int temp2 = array[r];
        array[r] = array[l];
        array[l] = temp2;
        quickSortInternal(array, 0, l);
        quickSortInternal(array, l + 1, r);
    }
    private static void quickSort(int[] arr) {
        quickSortInternal(arr, 0, arr.length - 1);
    }
}

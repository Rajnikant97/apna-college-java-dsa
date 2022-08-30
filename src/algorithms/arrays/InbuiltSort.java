package algorithms.arrays;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};
        Arrays.sort(arr);
        printArray(arr);

        arr = new int[]{4,5,1,3,2};
        Arrays.sort(arr, 0, 3);
        printArray(arr);

        Integer[] brr = {4,5,1,3,2};
        Arrays.sort(brr, Collections.reverseOrder());
        printArray(brr);

        brr = new Integer[]{4,5,1,3,2};
        Arrays.sort(brr, 0, 3, Collections.reverseOrder());
        printArray(brr);
    }

    public static void printArray(int[] arr) {
        for(int a : arr) {
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static void printArray(Integer[] arr) {
        for(int a : arr) {
            System.out.print(a+" ");
        }
        System.out.println();
    }
}

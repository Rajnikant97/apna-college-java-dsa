package data.structures.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1,5,4,3,6,2,5,8};
//        arr = new int[]{1, 5, 4, 3, 6, 2, 9, 8};

        System.out.println(containsDuplicateBruteForce(arr));
        System.out.println(containsDuplicateSorting(arr));
        System.out.println(containsDuplicateHashSet(arr));
    }

    public static boolean containsDuplicateHashSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if(set.contains(x)) {
                return true;
            } else {
                set.add(x);
            }
        }
        return false;
    }

    public static boolean containsDuplicateSorting(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) {
                return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicateBruteForce(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

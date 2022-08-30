package data.structures.arrays;

import java.util.*;

public class TripletsSumZero {
    public static void main(String[] args) {
        int[] arr = {-1, 0,  1, 2, -1, -4};
        printTriplets(arr);
    }

    public static void printTriplets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }

        result = new ArrayList<>(new LinkedHashSet<>(result));
        System.out.println(result);
    }
}

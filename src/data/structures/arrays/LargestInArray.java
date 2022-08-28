package data.structures.arrays;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 5, 8, 2, 1};
        LargestInArray lia = new LargestInArray();
        System.out.println("largest number is : " + lia.findLargest(arr));
    }

    public int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        return largest;
    }
}

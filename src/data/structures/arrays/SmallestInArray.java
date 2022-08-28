package data.structures.arrays;

public class SmallestInArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 5, 8, 2, 1};
        SmallestInArray sia = new SmallestInArray();
        System.out.println("largest number is : " + sia.findSmallest(arr));

    }

    public int findSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            smallest = Math.min(smallest, arr[i]);
        }
        return smallest;
    }
}

package data.structures.arrays;

public class PairsInArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 8, 10};
        PairsInArray pa = new PairsInArray();
        pa.print(arr);
    }

    public void print(int[] arr) {
        int totalPairs = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int next = arr[j];
                totalPairs++;
                System.out.print("(" + curr + "," + next + ") ");
            }
            System.out.println();
        }
        System.out.println("Total number of pairs = " + totalPairs);
    }
}

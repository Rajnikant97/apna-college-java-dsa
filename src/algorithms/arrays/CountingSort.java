package algorithms.arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1,4,1,3,2,4,3,7};
        sort(arr);

        for(int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        int range = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            range = Math.max(range, arr[i]);
        }

        int[] count = new int[range+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int ind = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[ind] = i;
                ind++;
                count[i]--;
            }
        }
    }
}

package algorithms.arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3};
        sort(arr);

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int swapCount = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }
            if(swapCount == 0) {
                break;
            }
        }
    }
}

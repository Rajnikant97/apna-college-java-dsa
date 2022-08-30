package algorithms.arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,1,2};
        sort(arr);
        for(int a : arr) {
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

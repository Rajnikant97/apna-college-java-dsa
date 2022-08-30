package algorithms.arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3};
        sort(arr);
        for(int a : arr) {
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int pos = i;
            for (int j = i-1; j >=0 ; j--) {
                if(arr[j] > temp) {
                    arr[j+1] = arr[j];
                    pos = j;
                } else {
                    break;
                }
            }
            arr[pos] = temp;
        }
    }
}

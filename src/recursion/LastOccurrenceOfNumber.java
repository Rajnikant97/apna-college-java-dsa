package recursion;

public class LastOccurrenceOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(lastIndexOf(4, arr,arr.length-1));
        System.out.println(lastIndexOf(8, arr,arr.length-1));
        System.out.println(lastIndexOf(0, arr,arr.length-1));
    }

    public static int lastIndexOf(int num, int[] arr, int ind) {
        if(ind < 0) {
            return -1;
        }

        if(arr[ind] == num) {
            return ind;
        }

        return lastIndexOf(num, arr, ind - 1);
    }
}

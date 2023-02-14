package recursion;

public class FirstOccurrenceOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(indexOf(arr, 4, 0));
        System.out.println(indexOf(arr, 8, 0));
        System.out.println(indexOf(arr, 0, 0));
    }

    public static int indexOf(int[] arr, int num, int ind) {
        if(ind == arr.length) {
            return -1;
        }
        if(arr[ind] == num) {
            return ind;
        }

        return indexOf(arr, num, ind + 1);
    }
}

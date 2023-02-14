package recursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        System.out.println(isSorted(arr, arr.length - 2));

        arr = new int[] {5,4,3,2,2,1};
        System.out.println(isSorted(arr, arr.length - 2));

        arr = new int[] {1,2,3,4,3,5};
        System.out.println(isSorted(arr, arr.length - 2));

        arr = new int[] {5,4,3,2,3,1};
        System.out.println(isSorted(arr, arr.length - 2));

        arr = new int[] {5};
        System.out.println(isSorted(arr, arr.length - 2));

        arr = new int[] {5,4};
        System.out.println(isSorted(arr, arr.length - 2));

        arr = new int[] {5,4,3};
        System.out.println(isSorted(arr, arr.length - 2));
    }

    public static boolean isSorted(int[] arr, int ind) {
        if(ind <= 0) {
            return true;
        }

        if(arr[ind - 1] > arr[ind] && arr[ind] < arr[ind + 1]) {
            return false;
        }

        if(arr[ind - 1] < arr[ind] && arr[ind] > arr[ind + 1]) {
            return false;
        }

        return isSorted(arr, ind - 1);
    }
}

package algorithms.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 7;
        BinarySearch bs = new BinarySearch();
        int index = bs.indexOf(arr, key);
        if(index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key found at index : " + index);
        }
    }

    public int indexOf(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

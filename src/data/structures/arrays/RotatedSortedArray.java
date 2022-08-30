package data.structures.arrays;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,8,9,0,1};
        int key = 8;

        int minInd = findMin(arr);
        int index = -1;

        if(key > arr[arr.length-1]) {
            index = binarySearch(0, minInd -1, arr, key);
        } else {
            index = binarySearch(minInd, arr.length-1, arr, key);
        }

        if(index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("index = " + index);
        }
    }

    public static int binarySearch(int start, int end, int[] arr, int key) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == key) {
                return mid;
            } else if(arr[mid] > key) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int findMin(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        if(arr[left] < arr[right]) {
            return 0;
        }

        while(left <= right) {
            int mid = (left + right + 1) / 2;
            if(arr[mid] < arr[mid-1]) {
                return mid;
            } else if (arr[mid] < arr[left]) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }
}

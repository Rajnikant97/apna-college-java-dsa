package algorithms.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5 ,6, 9, 10, 14, 16 ,19};
        int key = 10;

        LinearSearch ls = new LinearSearch();
        int index = ls.indexOf(arr, key);

        if(index == -1){
            System.out.println("not found");
        } else {
            System.out.println("key found at index : " + index);
        }
    }

    public int indexOf(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

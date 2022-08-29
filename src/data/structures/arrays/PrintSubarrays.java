package data.structures.arrays;

public class PrintSubarrays {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,10};
        PrintSubarrays ps = new PrintSubarrays();
        ps.print(arr);
    }

    public void print(int[] arr) {
        int totalSubarrays = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                System.out.print("{");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + ",");
                }
                totalSubarrays++;
                System.out.print("} ");
            }
            System.out.println();
        }
        System.out.println("total subarrays = " + totalSubarrays);
    }
}

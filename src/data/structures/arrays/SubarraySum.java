package data.structures.arrays;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {2,5,6,8,10};
        SubarraySum ps = new SubarraySum();
        ps.print(arr);
    }

    public void print(int[] arr) {
        int totalSubarrays = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int sum = 0;
                System.out.print("{");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + ",");
                    sum += arr[i];
                }
                totalSubarrays++;
                System.out.println("} = " + sum);
            }
            System.out.println();
        }
        System.out.println("total subarrays = " + totalSubarrays);
    }
}

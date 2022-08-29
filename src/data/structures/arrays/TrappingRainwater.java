package data.structures.arrays;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,3,2,6};
        solveBruteForce(arr);
        solveAuxArray(arr);
    }

    public static void solveAuxArray(int[] arr) {
        int trappedWater = 0;
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }

        rightMax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - arr[i];
        }

        System.out.println("trappedWater = " + trappedWater);
    }

    public static void solveBruteForce(int[] arr) {
        int area = 0;
        for (int i = 0; i < arr.length; i++) {
            int leftMax = arr[i];
            int rightMax = arr[i];
            for (int j = i; j < arr.length; j++) {
                rightMax = Math.max(rightMax, arr[j]);
            }
            for (int j = i; j >= 0; j--) {
                leftMax = Math.max(leftMax, arr[j]);
            }

            int waterLevel = Math.min(leftMax, rightMax);

            area += waterLevel - arr[i];
        }

        System.out.println("area = " + area);
    }
}

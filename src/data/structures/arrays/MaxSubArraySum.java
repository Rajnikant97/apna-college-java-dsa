package data.structures.arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,-5,2,-1,6,8,10,-3};
        MaxSubArraySum sum = new MaxSubArraySum();

        System.out.println("BruteForce = " + sum.getMaxSumBruteForce(arr));
        System.out.println("max2 = " + sum.getMaxSum2(arr));
        System.out.println("prefixSum = " + sum.getMaxSumPrefixSum(arr));
        System.out.println("Kadane sum = " + sum.getMaxSumKadaneAlgo(arr));
        System.out.println("minSum2 = " + sum.minSum2(arr));
    }

    public int getMaxSumKadaneAlgo(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(0, currSum + arr[i]);
            System.out.print(currSum + " ");
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println();
        return maxSum;
    }

    public int getMaxSum2(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                System.out.print(currSum+" ");
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println();
        return maxSum;
    }

    public int getMaxSumPrefixSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = (i == 0) ? prefixSum[j] : prefixSum[j] - prefixSum[i-1];
                System.out.print(currSum+" ");
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println();
        return maxSum;
    }

    public int getMaxSumBruteForce(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                System.out.print(currSum+" ");
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println();
        return maxSum;
    }

    public int minSum2(int[] arr) {
        int mixSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                mixSum = Math.min(mixSum, currSum);
            }
        }
        return mixSum;
    }
}

package data.structures.arrays;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] arr = {4,7,1,3,6,9,6};
//        arr = new int[]{6, 4, 3, 2, 1};
        System.out.println(solveBruteForce(arr));
        System.out.println(solveAuxArray(arr));
        System.out.println(solve(arr));
    }

    public static int solve(int[] arr) {
        int maxProfit = 0;
        int minBuy = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if(curr > minBuy) {
                maxProfit = Math.max(maxProfit, curr - minBuy);
            } else {
                minBuy = curr;
            }

//            maxProfit = Math.max(maxProfit, curr - minBuy);
//            minBuy = Math.min(minBuy, curr);
        }
        return maxProfit;
    }

    public static int solveAuxArray(int[] arr) {
        int n = arr.length;
        int maxProfit = Integer.MIN_VALUE;
        int[] maxSell = new int[n];
        maxSell[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            maxSell[i] = Math.max(maxSell[i+1], arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            maxProfit = Math.max(maxProfit, maxSell[i] - arr[i]);
        }
        return maxProfit;
    }

    public static int solveBruteForce(int[] arr) {
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            int buy = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                int sell = arr[j];
                maxProfit = Math.max(maxProfit, sell - buy);
            }
        }
        return maxProfit;
    }
}

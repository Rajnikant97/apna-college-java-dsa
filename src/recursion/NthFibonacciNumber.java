package recursion;

public class NthFibonacciNumber {
    static long count1 = 0;
    static long count2 = 0;
    public static void main(String[] args) {
        int n = 40;
        System.out.println(fib(n));
        System.out.println("count1 = " + count1);

        System.out.println(fib(n, new int[n + 1]));
        System.out.println("count2 = " + count2);
    }

    public static int fib(int n) {
        count1++;
//        System.out.println("f1 = " + n + "->" + count1);
        if(n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib(int n, int[] dp) {
        count2++;
//        System.out.println("f2 = " + n + "->" + count2);
        if(dp[n] != 0) {
            return dp[n];
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
}

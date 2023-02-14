package recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(sumN(10));
    }

    public static int sumN(int n) {
        if(n <= 0) {
            return 0;
        }

        return n + sumN(n - 1);
    }
}

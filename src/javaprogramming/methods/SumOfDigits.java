package javaprogramming.methods;

public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits s = new SumOfDigits();
        System.out.println(s.sumOfDigit(123));
    }

    public int sumOfDigit(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

package javaprogramming.methods;

public class Prime {
    public static void main(String[] args) {
        Prime p = new Prime();
        System.out.println(p.isPrime(5));
        System.out.println(p.isPrime(6));
    }

    public boolean isPrime(int n) {
        if(n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

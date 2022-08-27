package javaprogramming.methods;

import java.util.ArrayList;
import java.util.List;

public class PrimeInRange {
    public static void main(String[] args) {
        PrimeInRange p = new PrimeInRange();
        p.print(10);
        p.printAllPrime(20);
    }

    public void printAllPrime(int range) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        for (int i = 2; i <= range; i++) {
            boolean isPrime = true;
            for(int p : primes) {
                if(i % p == 0) {
                    isPrime = false;
                    break;
                }
                if(p > Math.sqrt(i)){
                    break;
                }
            }
            if(isPrime) {
                primes.add(i);
            }
        }
        System.out.println(primes);
    }

    public void print(int range) {
        for (int i = 2; i <= range; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
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

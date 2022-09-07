package algorithms.bitmanipulation;

public class PowerOf2 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            System.out.println(i + " -> " + isPowerOfTwo(i) + " " + isPowerOfTwo2(i) + " " + isPowerOfTwo3(i));
        }
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }

    public static boolean isPowerOfTwo2(int n) {
        int bitMask = 1;
        while((n & bitMask) != 1) {
            n = n >> 1;
        }
        return (n >> 1) == 0;
    }

    public static boolean isPowerOfTwo3(long n){
        if(n == 0) return false;
        return n == (n & -n);
    }
}

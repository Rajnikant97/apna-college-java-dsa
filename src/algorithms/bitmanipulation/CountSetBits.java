package algorithms.bitmanipulation;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 101;
        GetIthBit.printBits(n, 8);
        System.out.println(countSetBits(n));
        System.out.println(countSetBitsBrianKernighanAlgorithm(n));
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            count += n  & 1;
            n >>= 1;
        }
        return count;
    }



    public static int countSetBitsBrianKernighanAlgorithm(int n) {
        int count = 0;
        while(n > 0) {
            n &= (n-1);
            count++;
        }
        return count;
    }
}

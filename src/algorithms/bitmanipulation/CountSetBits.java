package algorithms.bitmanipulation;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 101;
        GetIthBit.printBits(n, 8);
        System.out.println(countSetBits(n));
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            count += n  & 1;
            n >>= 1;
        }
        return count;
    }
}

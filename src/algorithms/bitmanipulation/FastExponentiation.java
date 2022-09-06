package algorithms.bitmanipulation;

public class FastExponentiation {
    public static void main(String[] args) {
        int base = 5;
        for (int i = 0; i < 10; i++) {
            System.out.println(pow(base, i) + " " + Math.pow(base, i));
        }
    }

    public static int pow(int base, int expo) {
        int ans = 1;
        while (expo > 0) {
            if((expo & 1) == 1) {
                ans *= base;
            }
            base *= base;
            expo >>= 1;
        }
        return ans;
    }
}

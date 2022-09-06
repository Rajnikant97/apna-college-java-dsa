package algorithms.bitmanipulation;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + ", b = " + b);
    }
}

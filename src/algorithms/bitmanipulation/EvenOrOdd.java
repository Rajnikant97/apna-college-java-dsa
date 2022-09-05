package algorithms.bitmanipulation;

public class EvenOrOdd {
    public static void main(String[] args) {
        evenOrOdd(3);
        evenOrOdd(19);
        evenOrOdd(6);
    }

    public static void evenOrOdd(int num) {
        int bitMask = 1;
        if((num & bitMask) == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}

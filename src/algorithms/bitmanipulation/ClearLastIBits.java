package algorithms.bitmanipulation;

public class ClearLastIBits {
    public static void main(String[] args) {
        int num = 29;
        GetIthBit.printBits(num, 5);

        System.out.println("clear last i bits");
        num = clearLastIBits(num, 3);
        GetIthBit.printBits(num, 5);

        num = 29;
        System.out.println("clear last i bits2");
        GetIthBit.printBits(num, 5);
        clearLastIBits2(num, 3);
    }

    public static int clearLastIBits(int num, int i) {
        int bitMask = (~0) << i;
        return num & bitMask;
    }

    public static int clearLastIBits2(int num, int i) {

        for (int j = 0; j < i; j++) {
            int bitMask = ~(1 << j);
            num = num & bitMask;
            GetIthBit.printBits(num, 5);
        }
        return num;
    }
}

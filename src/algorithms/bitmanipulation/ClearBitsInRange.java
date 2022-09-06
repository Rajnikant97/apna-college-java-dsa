package algorithms.bitmanipulation;

public class ClearBitsInRange {
    public static void main(String[] args) {
        int num = 95;
        int least = 1;
        int most = 3;
        GetIthBit.printBits(num, 8);

        System.out.println("clear bits in range");
        num = clearBitsInRange(num, least, most);
        GetIthBit.printBits(num, 8);

        num = 95;
        System.out.println("clear bits in range 2");
        num = clearBitsInRange2(num, least, most);
        GetIthBit.printBits(num, 8);
    }

    public static int clearBitsInRange(int num, int least, int most) {
        int bitMask1 = (~0) << most + 1;
//        int bitMask2 = ~((~0) << least);
        int bitMask2 = (1 << least) - 1;
        int bitMask = bitMask1 | bitMask2;

        GetIthBit.printBits(bitMask1, 8);
        GetIthBit.printBits(bitMask2, 8);
        GetIthBit.printBits(bitMask, 8);
        return num & bitMask;
    }

    public static int clearBitsInRange2(int num, int least, int most) {
        for (int i = least; i <= most; i++) {
            int bitMask  = ~(1 << i);
            num = num & bitMask;
        }
        return num;
    }
}
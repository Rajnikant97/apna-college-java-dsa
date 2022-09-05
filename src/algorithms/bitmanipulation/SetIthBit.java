package algorithms.bitmanipulation;

public class SetIthBit {
    public static void main(String[] args) {
        int num = 9;
        GetIthBit.printBits(num, 4);

        System.out.println("set ith bit");
        num = setIthBit(num, 2);
        GetIthBit.printBits(num, 4);
    }
    public static int setIthBit(int num, int i) {
        int bitMask = 1 << i;
        return num | bitMask;
    }
}

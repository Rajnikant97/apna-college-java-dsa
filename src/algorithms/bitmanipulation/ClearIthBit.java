package algorithms.bitmanipulation;

public class ClearIthBit {
    public static void main(String[] args) {
        int num = 9;
        GetIthBit.printBits(num, 4);

        System.out.println("clear ith bit");
        num = clearIthBit(num, 0);
        GetIthBit.printBits(num, 4);
    }
    public static int clearIthBit(int num, int i) {
        int bitMask = ~(1 << i);
        return num & bitMask;
    }
}

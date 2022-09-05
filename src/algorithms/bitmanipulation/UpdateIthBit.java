package algorithms.bitmanipulation;

public class UpdateIthBit {
    public static void main(String[] args) {
        int num = 9;
        GetIthBit.printBits(num, 4);

        System.out.println("update ith bit");
        num = updateIthBit(num, 2, 1);
        GetIthBit.printBits(num, 4);

        System.out.println("update ith bit");
        num = updateIthBit(num, 2, 0);
        GetIthBit.printBits(num, 4);
    }
    public static int updateIthBit(int num, int i, int newBit) {
        int bitMask = ~(1 << i);
        num = num & bitMask;
        return num | (newBit << i);
    }

    public static int updateIthBit2(int num, int i, int newBit) {
        if(newBit == 0) {
            int bitMask = ~(1 << i);
            return num & bitMask;
        } else {
            int bitMask = 1 << i;
            return num | bitMask;
        }
    }
}

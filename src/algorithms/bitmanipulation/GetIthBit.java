package algorithms.bitmanipulation;

public class GetIthBit {

    public static void main(String[] args) {
        int num = 9;
        GetIthBit.printBits(num, 4);
    }

    public static int getIthBit(int num , int i) {
        int bitMask = 1;
        int rightShift = num >> i;
        return rightShift & bitMask;
    }

    public static int getIthBit2(int num , int i) {
        int bitMask = 1 << i;
        return (num & bitMask) == 0 ? 0 : 1;
    }

    public static void printBits(int num, int x){
        for (int i = x; i >= 0; i--) {
            System.out.print(getIthBit(num, i)+" ");
        }
        System.out.println("\n");
    }
}

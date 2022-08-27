package javaprogramming.methods;

public class BinaryToDecimal {
    public static void main(String[] args) {
        BinaryToDecimal b = new BinaryToDecimal();
        System.out.println(b.convert(1101));
    }

    public int convert(int bin) {
        int dec = 0;
        int pow = 0;
        while(bin > 0) {
            int rem = bin % 10;
            dec += rem * Math.pow(2, pow);
            pow++;
            bin /= 10;
        }
        return dec;
    }
}

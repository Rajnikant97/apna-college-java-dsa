package javaprogramming.methods;

public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary d = new DecimalToBinary();
        System.out.println(d.convert(11));
    }

    public int convert(int dec) {
        int bin = 0;
        int pow = 0;
        while(dec > 0) {
            int rem = dec % 2;
            bin += rem * Math.pow(10, pow);
            dec /= 2;
            pow++;
        }
        return bin;
    }
}

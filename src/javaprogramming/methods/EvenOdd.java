package javaprogramming.methods;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd e = new EvenOdd();
        System.out.println(e.isEven(6));
        System.out.println(e.isEven(9));
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }
}

package javaprogramming.loops.pattern;

public class PalindromicPattern {
    public static void main(String[] args) {
        PalindromicPattern pp = new PalindromicPattern();
        pp.print(5);
    }

    public void print(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

package javaprogramming.loops.pattern;

public class Butterfly {
    public static void main(String[] args) {
        Butterfly b = new Butterfly();
        b.print(5);
    }

    public void print(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= h-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= h-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h-i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= h-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

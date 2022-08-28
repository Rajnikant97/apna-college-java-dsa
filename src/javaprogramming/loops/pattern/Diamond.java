package javaprogramming.loops.pattern;

public class Diamond {

    public static void main(String[] args) {
        Diamond d = new Diamond();
        d.printMethod1(5);
        d.printMethod2(4);
    }

    public void printMethod2(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = h; i >= 1; i--) {
            for (int j = 1; j <= h-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printMethod1(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*h - (2*i-1)); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

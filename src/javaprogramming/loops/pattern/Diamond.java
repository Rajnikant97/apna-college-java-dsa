package javaprogramming.loops.pattern;

public class Diamond {

    public static void main(String[] args) {
        Diamond d = new Diamond();
        d.print(5);
    }

    public void print(int h) {
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

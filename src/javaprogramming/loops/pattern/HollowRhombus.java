package javaprogramming.loops.pattern;

public class HollowRhombus {
    public static void main(String[] args) {
        HollowRhombus hr = new HollowRhombus();
        hr.print(5);
    }

    public void print(int h) {
        for (int i = 1; i <= h-1; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= h; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 2; i <= h-1; i++) {
            for (int j = 1; j <= h-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= h-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 1; i <= h; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

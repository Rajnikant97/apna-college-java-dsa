package javaprogramming.loops.pattern;

public class Rhombus {
    public static void main(String[] args) {
        Rhombus r = new Rhombus();
        r.print(5);
    }

    public void print(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= h; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

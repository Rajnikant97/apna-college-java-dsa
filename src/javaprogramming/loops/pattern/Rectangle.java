package javaprogramming.loops.pattern;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.print(5);
    }

    public void print(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

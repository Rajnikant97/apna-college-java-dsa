package javaprogramming.loops.pattern;

public class HollowRectangle {
    public static void main(String[] args) {
        HollowRectangle hr = new HollowRectangle();
        hr.print(5);
        hr.print(6,4);
    }

    public void print(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if(i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void print(int h) {

        for (int i = 1; i <= h; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int j=1; j<= h-2;j++) {
            System.out.print("*");
            for (int i = 1; i <= h - 2; i++) {
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

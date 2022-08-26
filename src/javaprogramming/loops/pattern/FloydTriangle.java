package javaprogramming.loops.pattern;

public class FloydTriangle {
    public static void main(String[] args) {
        FloydTriangle ft = new FloydTriangle();
        ft.print(5);
    }

    public void print(int h) {
        int counter = 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();

        }
    }
}

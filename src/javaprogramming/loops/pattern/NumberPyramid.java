package javaprogramming.loops.pattern;

public class NumberPyramid {
    public static void main(String[] args) {
        NumberPyramid np = new NumberPyramid();
        np.print(5);
    }

    public void print(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

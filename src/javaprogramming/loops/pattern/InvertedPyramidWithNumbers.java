package javaprogramming.loops.pattern;

public class InvertedPyramidWithNumbers {
    public static void main(String[] args) {
        InvertedPyramidWithNumbers ip = new InvertedPyramidWithNumbers();
        ip.print(5);
    }

    public void print(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= (h - i + 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

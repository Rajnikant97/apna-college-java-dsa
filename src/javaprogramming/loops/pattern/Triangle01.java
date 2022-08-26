package javaprogramming.loops.pattern;

public class Triangle01 {
    public static void main(String[] args) {
        Triangle01 t = new Triangle01();
        t.print(5);
    }

    public void print(int h) {
        boolean one = true;
        for (int i = 1; i <= h ; i++) {
            one = i%2==1;
            for (int j = 1; j <= i ; j++) {
                System.out.print((one) ? 1 : 0);
                one = !one;
            }
            System.out.println();
        }
    }
}

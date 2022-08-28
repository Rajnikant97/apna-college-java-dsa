package javaprogramming.loops.pattern;

public class Triangle01 {
    public static void main(String[] args) {
        Triangle01 t = new Triangle01();
        t.printMethod1(5);
        t.printMethod2(5);
    }

    public void printMethod2(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public void printMethod1(int h) {
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

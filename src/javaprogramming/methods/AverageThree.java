package javaprogramming.methods;

public class AverageThree {
    public static void main(String[] args) {
        AverageThree a = new AverageThree();
        System.out.println(a.compute(3, 4, 5));
    }

    public float compute(float a, float b, float c) {
        return  (a + b + c) / 3f;
    }
}

package algorithms.bitmanipulation;

public class AddOne {
    public static void main(String[] args) {
        int x = 6;
        x = -(~x); //Increment
        System.out.println(x);

        x = ~(-x); //Decrement
        System.out.println(x);
    }
}

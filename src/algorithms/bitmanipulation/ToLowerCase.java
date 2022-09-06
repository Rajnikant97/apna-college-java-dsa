package algorithms.bitmanipulation;

public class ToLowerCase {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z' ; ch++) {
            System.out.print((char) (ch | ' '));
        }
        System.out.println();
        for (char ch = 'a'; ch <= 'z' ; ch++) {
            System.out.print((char) (ch ^ ' '));
        }
    }
}

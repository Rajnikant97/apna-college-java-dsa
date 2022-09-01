package javaprogramming.strings;

public class LargestString {
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "orange", "banana"};
        System.out.println(getLargest(fruits));
    }

    public static String getLargest(String[] fruits) {
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    }
}

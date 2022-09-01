package javaprogramming.strings;

public class CountLowerVowels {
    public static void main(String[] args) {
        String str = "Hello! I am  a java developer";
        System.out.println(count(str));
    }

    public static int count(String str) {
        int count = 0;;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        return count;
    }
}

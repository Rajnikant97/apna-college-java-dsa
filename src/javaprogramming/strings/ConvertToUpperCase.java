package javaprogramming.strings;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        String str = "i am a java programmer";

        System.out.println(toUpperCase(str));
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));


        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.charAt(i-1) == ' ') {
                ch = Character.toUpperCase(ch);
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}

package javaprogramming.strings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbfcccdde";
        System.out.println(compress(str));
        System.out.println(compress2(str));
    }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            char ch = str.charAt(i);

            while (i < str.length() - 1 && ch == str.charAt(i+1)) {
                count++;
                i++;
            }

            sb.append(ch);
            if(count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static String compress2(String str) {
        StringBuilder sb = new StringBuilder("");
        char prev = str.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == prev) {
                count++;
            } else {
                sb.append(prev);
                if(count > 1){
                    sb.append(count);
                }
                prev = str.charAt(i);
                count = 1;
            }
        }

        sb.append(prev);
        if(count > 1){
            sb.append(count);
        }

        return sb.toString();
    }
}

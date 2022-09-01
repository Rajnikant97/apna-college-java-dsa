package javaprogramming.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AnagramStrings {
    public static void main(String[] args) {
        String str1 = "carraeca";
        String str2 = "raraceca";
        String str3 = "caarrcas";

        System.out.println(isAnagram(str1, str2));
        System.out.println(isAnagram(str1, str3));
    }

    public static boolean isAnagram(String str1, String str2) {
        Map<Character, Integer> map1 = countCharacters(str1);
        Map<Character, Integer> map2 = countCharacters(str2);

        if(map1.size() != map2.size()) {
            return false;
        }

        for(char ch : map1.keySet()) {
            if(!Objects.equals(map2.get(ch), map1.get(ch))) {
                return false;
            }
        }
        return true;
    }

    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)) {
                map.replace(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }
}

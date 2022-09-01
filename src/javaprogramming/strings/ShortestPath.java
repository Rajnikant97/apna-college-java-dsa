package javaprogramming.strings;

public class ShortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }

    public static double shortestPath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'E' :
                    x++;
                    break;
                case 'W' :
                    x--;
                    break;
                case 'N' :
                    y++;
                    break;
                case 'S' :
                    y--;
                    break;
                default:
                    System.out.println("Invalid direction");
            }
        }
        return Math.sqrt(x * x + y * y);
    }
}

package javaprogramming.methods;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(123));
        System.out.println(p.isPalindrome(1221));
    }

    public boolean isPalindrome(int num) {
        int reverse = 0;
        int temp = num;
        while(temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        return num == reverse;
    }
}

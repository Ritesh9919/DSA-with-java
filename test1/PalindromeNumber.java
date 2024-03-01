package test1;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        boolean isPalindrome = false;
        int temp = number;
        int reverse = 0;

        while(temp > 0) {
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;

        }

        if(number == reverse) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }
}

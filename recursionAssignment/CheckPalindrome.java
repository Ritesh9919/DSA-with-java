package recursionAssignment;

public class CheckPalindrome {

    public static boolean checkPalindrome(String str, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return true;
        }

        if(str.charAt(startIndex) != str.charAt(endIndex)) {
            return false;
        }

        return checkPalindrome(str, startIndex+1, endIndex-1);
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(checkPalindrome(str, 0, str.length()-1));
    }
}

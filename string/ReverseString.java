package string;

public class ReverseString {

    public static String reverse(String str) {
        String reversedStr = "";

        // for(int i = str.length()-1; i >= 0; i--) {
        //     reversedStr += str.charAt(i);
        // }

        for(int i = 0; i < str.length();i++) {
            reversedStr = str.charAt(i) + reversedStr;
        }

        return reversedStr;

    }
    public static void main(String[] args) {
        String str = "coding";
        System.out.println(reverse(str));
    }
}

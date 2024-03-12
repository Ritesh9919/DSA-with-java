package string;

public class ReverseEachWord {

    public static String reverseEachWord(String str) {
        String result = "";
        int start = 0;
        int i = 0;

        for(; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                int end = i-1;
                String reverse = "";
                for(int j = start; j <= end; j++) {
                    reverse = str.charAt(j) + reverse;
                }
                
                result += reverse + " ";
                start = i + 1;
            }
        }

        int end = i-1;
        String reverse = "";
        for(int j = start; j <= end; j++) {
            reverse = str.charAt(j) + reverse;
        }
        result += reverse;

        return result;
    }
    public static void main(String[] args) {
        String str = "abc def ghi";
        System.out.println(reverseEachWord(str));
    }
}

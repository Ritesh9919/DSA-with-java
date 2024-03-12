package string;

public class ReverseStringWordWise {
    public static String reverseWordWise(String input) {
		// Write your code here
		String reversed = "";
		String result = "";

		for(int i = input.length()-1; i >= 0; i--) {
			reversed += input.charAt(i);
		}

		int start = 0;
		int i = 0;

		for(; i < reversed.length(); i++) {
			if(reversed.charAt(i) == ' ') {
				int end = i-1;
				String reverse = "";
				for(int j = start; j <= end; j++) {
					reverse = reversed.charAt(j) + reverse;
				}
				result += reverse + " ";
				start = i+1;
			}
		}

		int end = i-1;
		String reverse = "";
		for(int j = start; j <= end; j++) {
			reverse = reversed.charAt(j) + reverse;
		}

		result += reverse;

		return result;

	}
    public static void main(String[] args) {
        String str = "abc def ghi";
        System.out.println(reverseWordWise(str));
    }
}

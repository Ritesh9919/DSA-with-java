package string;

public class RemoveCharacter {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String ans = "";

		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ch) {
				ans += str.charAt(i);
			}
		}
		return ans;
	}
    public static void main(String[] args) {
        String str = "abcanc";
        char ch = 'a';
        System.err.println(removeAllOccurrencesOfChar(str, ch));
    }
}

package string;

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		int [] freq = new int[26];

		for(int i = 0; i < str1.length(); i++) {
			int a = (int)str1.charAt(i) - 97;
			freq[a]+= 1;
		}

		for(int j = 0; j < str2.length(); j++) {
			int b = (int)str2.charAt(j) - 97;
			freq[b]-=1;
		}

		for(int k = 0; k < freq.length; k++) {
			if(freq[k] > 0) {
				return false;
			}
		}

		return true;
	}

    public static void main(String[] args) {
        String str1 = "coding";
        String str2 = "inocgd";
        System.out.println(isPermutation(str1, str2));
    }
}

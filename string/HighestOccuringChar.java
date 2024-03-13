package string;

public class HighestOccuringChar {
    public static char highestOccuringChar(String str) {
		//Your code goes here
          
	         

		   int[] freq = new int[26];

		   for(int i = 0; i < str.length(); i++) {
			   int a = (int)str.charAt(i)-97;
			   freq[a] += 1;
		   }

		   int ans = 0;
		   int count = freq[0];

		   for(int j = 1; j < freq.length; j++) {
                if(freq[j] > count) {
					count = freq[j];
					ans = j;
				}
		   }

		  
		  return (char)(ans + 97);
	}
    public static void main(String[] args) {
        String str = "aabacdb";
        System.out.println(highestOccuringChar(str));
    }
}

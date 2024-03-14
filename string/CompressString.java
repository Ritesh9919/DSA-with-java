package string;

public class CompressString {

    public static String compressString(String str) {
        String ans = "";
        
        for(int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            ans += str.charAt(i);
            if(count > 1) {
                ans += count;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aabccdn";
        System.out.println(compressString(str));
    }
}

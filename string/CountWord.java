package string;

public class CountWord {

    public static int countWord(String str) {
        int ans = 1;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "Coding Ninja is my favorite";
        System.out.println(countWord(str));
    }
}

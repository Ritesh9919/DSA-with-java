package string;

public class RemoveConsecutiveDublicate {

    public static String removeConsecutiveDublicate(String str) {

        String result = "";
        for(int i = 0; i < str.length(); i++) {
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                i++;
            }
            result += str.charAt(i);

        }
        return result;
    }
    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println(removeConsecutiveDublicate(str));
    }
}

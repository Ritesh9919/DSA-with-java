package recursionAssignment;

public class StringToInteger {

    public static int stringToInteger(String str) {
        if(str.length() == 1) {
            return str.charAt(0) - '0';
        }

        int smallOutput = stringToInteger(str.substring(1));
        int a = str.charAt(0) - 'a';
        int result = (int)(a * Math.pow(10, str.length()-1) + smallOutput);
        return result;
    }
    public static void main(String[] args) {
        String str = "1342";
        System.out.println(stringToInteger(str));
    }
}

package recursion2;

public class RecursionWithString {

    public static String solution(String str, char a,  char b) {
        if(str.length() == 0) {
            return str;
        }

        String smallOutput = solution(str.substring(1), a, b);
        if(str.charAt(0) == a) {
            return b + smallOutput;
        }else{
            return str.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        String str = "abxcsdx";
        char a = 'x';
        char b = 'y';
        System.out.println(solution(str,a,b));
    }
}

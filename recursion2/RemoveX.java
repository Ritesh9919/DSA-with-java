package recursion2;

public class RemoveX {

    public static String removeX(String str) {
        if(str.length() == 0) {
            return str;
        }

        String smallOutput = removeX(str.substring(1));
        if(str.charAt(0) == 'x') {
            return smallOutput;
        }
        return str.charAt(0) + smallOutput;
    }
    public static void main(String[] args) {
        String str = "xaxb";
        System.out.println(removeX(str));
    }
}

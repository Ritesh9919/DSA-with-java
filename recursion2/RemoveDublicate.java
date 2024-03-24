package recursion2;

public class RemoveDublicate {

    public static String removeDublicate(String str) {
        if(str.length() == 1) {
            return str;
        }

        if(str.charAt(0) == str.charAt(1)) {
            return removeDublicate(str.substring(1));
        }else{
            return str.charAt(0) + removeDublicate(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "aabcdee";
        System.out.println(removeDublicate(str));
    }
}

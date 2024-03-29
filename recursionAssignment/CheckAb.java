package recursionAssignment;

public class CheckAb {

    public static boolean checkAb(String str) {
        if(str.length() == 0) {
            return true;
        }

        if(str.charAt(0) == 'a') {
            if(str.substring(1).length() > 1 && str.substring(1,3).equals("bb")) {
                return checkAb(str.substring(3));
            }else{
                return checkAb(str.substring(1));
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "abb";
        System.out.println(checkAb(str));
    }
}

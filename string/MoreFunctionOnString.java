package string;

public class MoreFunctionOnString {
    public static void main(String[] args) {
        String str1 = "Coding";
        String str2 = "Aoding";
        System.out.println(str1 += str2);
        System.out.println(str1.concat(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("ing"));

    }
}

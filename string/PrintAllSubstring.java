package string;

public class PrintAllSubstring {

    public static void printAllSubstring(String str) {
        for(int i = 0; i < str.length(); i++) {
            for(int j = i; j < str.length(); j++) {
                System.out.println(str.substring(i, j+1));
            }
        }
    }
    public static void main(String[] args) {
        String str = "hello";
        printAllSubstring(str);
    }
}

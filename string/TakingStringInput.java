package string;
import java.util.Scanner;;

public class TakingStringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str + " " + str.length());
        
    }
}

package functionAndScope;
import java.util.Scanner;

public class FibonacciMember {

    public static boolean checkMember(int n) {
        int num1 = 0;
        int num2  = 1;

        while (num1 < n) {
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        if(num1 == n) {
            return true;
        }else{
            return false;
        }

    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkMember(n));
    }
}

package operatorAndForLoop;
import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int power = 0;
        int ans = 0;

        while(input > 0) {
            int lastDigit = input % 10;
            ans = (int)(ans + lastDigit * Math.pow(2,power)); 
            power++;
            input /= 10;
        }

        System.out.println(ans);
    }
}

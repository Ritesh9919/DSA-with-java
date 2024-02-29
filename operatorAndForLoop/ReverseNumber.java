package operatorAndForLoop;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int reverse = 0;
        while(input > 0) {
            int lastDigit = input % 10;
            reverse = (reverse * 10) + lastDigit;
            input = input / 10;
        }

        System.out.println(reverse);
    }
}

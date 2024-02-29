package operatorAndForLoop;
import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        long binary = 0;
        int power = 0;

        while(input > 0) {
            int remainder = input % 2;
            binary = binary + (remainder * (long)Math.pow(10,power));
            power++;
            input /= 2;
        }

        System.out.println(binary);
    }
}

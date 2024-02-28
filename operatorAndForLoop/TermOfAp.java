package operatorAndForLoop;
import java.util.*;

public class TermOfAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int current = 1;

        while(count < n) {
            int term = 3 * current + 2;
            if(term % 4 != 0) {
                System.out.print(term + " ");
                count++;
            }
            current++;
        }
    }
}

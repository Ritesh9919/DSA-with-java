package test2;
import java.util.*;

public class NumberStarPattern {

    public static void printNumberStar(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }

            for(int star = 1; star <= 2 * i - 2; star++) {
                System.out.print("*");
            }

            for(int num = n-i+1; num >= 1; num--) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumberStar(n);
    }
}

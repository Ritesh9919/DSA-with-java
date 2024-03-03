package test2;
import java.util.*;

// We are given a 4 digit number using digits 1 to 9. What is the maximum 3 digit number that we can make by removing one digit from the given integer.

public class MaximumNumber {
    public static int max_number(int n) {
        int max = Integer.MIN_VALUE;
        String numStr = String.valueOf(n);

        for(int i = 0; i < numStr.length(); i++) {
            StringBuilder sb = new StringBuilder(numStr);
            sb.deleteCharAt(i);
            int temp = Integer.parseInt(sb.toString());
            if(temp > max && temp < 1000) {
                max = temp;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(max_number(n));
    }
}

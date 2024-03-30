package test4;

import java.util.Arrays;

public class MaxProfit {

    public static int maxProfit(int[] budget) {
        Arrays.sort(budget);
        int result = Integer.MIN_VALUE;
        int m = budget.length;

        for(int i = 0; i < m; i++) {
            result = Math.max(result, budget[i] * (m - i));
        }
        return result;
    }
    public static void main(String[] args) {
        int[] budget = {30, 20, 53, 14};
        System.out.println(maxProfit(budget));
    }
}

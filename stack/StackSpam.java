package stack;
import java.util.Stack;
import java.util.Arrays;

public class StackSpam {

    public static int[] stackSpam(int[] price) {
         Stack<Integer> s = new Stack<>();
         int[] spam = new int[price.length];
         s.push(0);
         spam[0] = 1;

         for(int i = 1; i < price.length; i++) {
            int currPrice = price[i];
            while (!s.isEmpty() && currPrice > price[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()) {
                spam[i] = i + 1;
            }else{
                int prevHigh = s.peek();
                spam[i] = i - prevHigh;
            }
            s.push(i);
         }
         return spam;
    }
    public static void main(String[] args) {
        int[] price = {60,70,80,100,90,75,80,120};
        int[] result = stackSpam(price);
        System.out.println(Arrays.toString(result));
    }
}

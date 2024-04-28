package stack;
import java.util.Stack;

public class RedundantBracket {

    public static boolean checkRedundant(String expression) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch == ')') {
               int count = 0;
               while (s.peek() != '(') {
                 count++;
                 s.pop();
               }
               if(count < 2) {
                return true;
               }
               s.pop();
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(a + (a + b))";
        System.out.println(checkRedundant(str));
    }
}

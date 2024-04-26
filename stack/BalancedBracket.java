package stack;
import java.util.Stack;

public class BalancedBracket {

    public static boolean isBalaced(String expression) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch == '(' || ch == '{') {
                s.push(ch);
            }else{
                if(s.isEmpty()) {
                    return false;
                }

                if(s.peek() == '(' && ch == ')' || s.peek() == '{' && ch == '}') {
                    s.pop();
                }else{
                    return false;
                }
            }
        }

        if(s.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "((())";
        System.out.println(isBalaced(str));
    }
}

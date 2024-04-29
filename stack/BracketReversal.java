package stack;
import java.util.Stack;

public class BracketReversal {

    public static int bracketReversal(String input) {
        Stack<Character> s = new Stack<>();
        if(input.length() % 2 != 0) {
            return -1;
        }

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch == '{') {
                s.push(ch);
            }else{
                if(!s.isEmpty() && s.peek() == '{') {
                    s.pop();
                }else{
                    s.push(ch);
                }
            }
        }

        int count = 0;
        while (!s.isEmpty()) {
            char c1 = s.pop();
            char c2 = s.pop();
            if(c1 == c2) {
                count+=1;
            }else{
                count+=2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "{{}}{{{{";
        System.out.println(bracketReversal(str));
    }
}

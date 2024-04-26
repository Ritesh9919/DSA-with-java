package stack;
import java.util.Stack;

public class StackInCollection {
    public static void main(String[] args) {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        Stack<Integer> s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.size());
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.size());

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }

    }
}

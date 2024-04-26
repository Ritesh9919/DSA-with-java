package stack;
import java.util.Stack;

public class ReverseStack {

    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
		if(input.size() <= 1) {
			return;
		}
		
		int temp = input.pop();
		// reverse remaining element
		reverseStack(input, extra);

		// push element from input to extra 
		while(!input.isEmpty()) {
			extra.push(input.peek());
			input.pop();
		}

		// push last element to input
		input.push(temp);

		// push all element from extra to input back
		while(!extra.isEmpty()) {
			input.push(extra.peek());
			extra.pop();
		}
	}
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.push(1);
        input.push(2);
        input.push(3);
        input.push(4);
        Stack<Integer> extra = new Stack<>();
        reverseStack(input, extra);
        while (!input.isEmpty()) {
            System.out.print(input.peek() + " ");
            input.pop();
        }
    }
}

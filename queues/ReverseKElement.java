package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElement {
    
        public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
		Queue<Integer> q = new LinkedList<>();
		Stack<Integer> s = new Stack();

		for(int i = 1; i <= k; i++) {
			s.push(input.remove());
		}

		while(!s.isEmpty()) {
			q.add(s.pop());
		}

		while(!input.isEmpty()) {
			q.add(input.remove());
		}

		return q;
    }

    public static void main(String[] args) {
        
    }
    }

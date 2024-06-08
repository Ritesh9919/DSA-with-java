package queues;
import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int size;
    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int data) {
        q1.add(data);
        size++;
    }

    public int pop() {
        if(q1.isEmpty()) {
            return -1;
        }

        while (q1.size() != 1) {
             q2.add(q1.remove());
        }
        int temp = q1.remove();
        size--;
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        return temp;
    }

    public int top() {
        if(q1.isEmpty()) {
            return -1;
        }

        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int temp = q1.peek();
        q2.add(q1.remove());
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        return temp;
    }
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.size());
        // System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.size());


    }
}

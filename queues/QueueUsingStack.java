package queues;
import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> q1;
    Stack<Integer> q2;

    public QueueUsingStack() {
        q1 = new Stack<>();
        q2 = new Stack<>();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public int size() {
        return q1.size();
    }

    public void enqueue(int data) {
        q1.push(data);
    }

    public int front() {
        while (!q1.isEmpty()) {
            q2.push(q1.pop());
        }
        int temp = q2.peek();
        while (!q2.isEmpty()) {
            q1.push(q2.pop());
        }
        return temp;
    }

    public int dequeue() {
        while (!q1.isEmpty()) {
            q2.push(q1.pop());
        }
        int temp = q2.pop();
        while (!q2.isEmpty()) {
            q1.push(q2.pop());
        }
        return temp;
    }
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.front());
        System.err.println(q.dequeue());
        System.out.println(q.size());
    }
}

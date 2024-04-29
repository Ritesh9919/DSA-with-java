package queues;

public class Queue {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public Queue() {
        this.data = new int[5];
        this.front = -1;
        this.rear = -1;
    }

    public Queue(int capacity) {
        this.data = new int[capacity];
        this.front = -1;
        this.rear = -1;
    }

    public int size() {
       return size;
    }

    public boolean isEmpty() {
       return size == 0;
    }

    public void doubleCapacity() {
        int temp[] = data;
        data = new int[temp.length * 2];
        for(int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }

    }

    public void enqueue(int ele) {
        if(size == data.length) {
            doubleCapacity();
        }
       data[++rear] = ele;
       size++;
       if(front == -1) {
        front++;
       }
    }

    public int front() throws QueueEmptyException {
        if(size == 0) {
          throw new QueueEmptyException();
        }
        return data[front];
    }

    public int dequeue() {
        

        int temp = data[front];
        front++;
        size--;
        if(size == 0) {
            front = -1;
            rear = 1;
        }
        return temp;
    }
    public static void main(String[] args) throws QueueEmptyException {
        Queue q = new Queue();
       
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        // System.out.println(q.size());
        // System.out.println(q.front());
        // q.dequeue();
        // System.out.println(q.size());
        // System.out.println(q.front());

        while (!q.isEmpty()) {
            System.out.print(q.front() + " ");
            q.dequeue();
        }

    }
}

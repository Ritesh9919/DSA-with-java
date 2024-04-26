package stack;

public class Stack2<T> {
    Node<Integer> head;
    private int size;

    public int size() {
       return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T ele) {
        @SuppressWarnings({ "rawtypes", "unchecked" })

        Node<Integer> newNode = new Node(ele);
        newNode.next = head;
        head = newNode;
        size++;

    }

    public T top() throws StackEmptyException{
        if(head == null) {
            throw new StackEmptyException();
        }
        return head.data;
    }

    public T pop() throws StackEmptyException {
        if(head == null) {
            throw new StackEmptyException()
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
    public static void main(String[] args) {
        
    }
}

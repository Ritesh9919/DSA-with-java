package linkedList;

public class Node<T> {
     
    T data;
    Node next;

    Node(T data) {
        this.data = data;
    }

    public static void print(Node<Integer> head) {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }

    public static void increment(Node<Integer> head) {
          
        Node<Integer> temp = head;

        while(temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        head.next = n2;
        n2.next = n3;
        increment(head);
        print(head);

    }
}

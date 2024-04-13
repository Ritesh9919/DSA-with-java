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

    public static int countNode(Node<Integer> head) {
        int result = 0;
        Node<Integer> temp = head;

        while (temp != null) {
            result++;
            temp = temp.next;
        }

        return result;
    }

    public static void printIthNodeData(Node<Integer> head, int i) {
        int count = 0;
        Node<Integer> temp = head;

        while(temp != null) {
            if(count == i) {
              System.out.println(temp.data);
            }

            count++;
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        Node<Integer> n5 = new Node<Integer>(50);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        // increment(head);
        // print(head);
        System.out.println(countNode(head));
        printIthNodeData(head, 3);

    }
}

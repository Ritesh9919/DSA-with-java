package linkedList;

import java.util.Scanner;

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

    @SuppressWarnings("unchecked")
    public static void increment(Node<Integer> head) {
          
        Node<Integer> temp = head;

        while(temp != null) {
            temp.data++;
            temp = temp.next;
        }
    }

    @SuppressWarnings("unchecked")
    public static int countNode(Node<Integer> head) {
        int result = 0;
        Node<Integer> temp = head;

        while (temp != null) {
            result++;
            temp = temp.next;
        }

        return result;
    }



    @SuppressWarnings("unchecked")
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

    @SuppressWarnings("unchecked")
    public static Node<Integer> takeInput() {
           Scanner sc = new Scanner(System.in);
           int data = sc.nextInt();

           Node<Integer> head = null;

           while(data != -1) {
            Node<Integer> currNode = new Node<Integer>(data);
            if(head == null) {
                head = currNode;
            }else{
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currNode;
            }
            data = sc.nextInt();
           }

           return head;
    }

    @SuppressWarnings("unchecked")
    public static Node<Integer> insertNode(Node<Integer> head, int pos, int data) {
          Node<Integer> newNode = new Node<Integer>(data);

          if(pos == 0) {
            newNode.next = head;
            return newNode;
          }

          Node<Integer> prev = head;
          int count = 0;

          while(count < pos-1 && prev != null) {
            prev = prev.next;
            count++;
          }

          if(prev != null) {
            Node<Integer> next = prev.next;
            prev.next = newNode;
            prev.next.next = next;
          }

          return head;
    }

    @SuppressWarnings("unchecked")
    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        if(head == null) {
            return head;
        }

        if(pos == 0) {
            return head.next;
        }

        Node<Integer> prev = head;
        int count = 0;

        while (count < pos-1 && prev != null) {
            count++;
            prev = prev.next;
        }

        if(prev != null && prev.next != null) {
            prev.next = prev.next.next;
        }

        return head;
    }

    @SuppressWarnings("unchecked")
    public static int findNode(Node<Integer> head, int n) {
        Node<Integer> temp = head;
        int index = 0;

        while (temp != null) {
            if(temp.data == n) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    public static Node<Integer> appendLastNNodeToFirst(Node<Integer> head, int n) {
        if(head == null) {
            return head;
        }

        if(n == 0) {
            return head;
        }

        Node<Integer> temp = head;
        int size = 0;

        while(temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;
        int count = 1;

        while(count < size-n) {
            count++;
            temp = temp.next;
        }

        Node<Integer> newHead = temp.next;
        temp.next = null;
        Node<Integer> temp1 = newHead;

        while (temp1.next != null) {
            temp1 = temp1.next;
        }

        temp1.next = head;
        return newHead;
    }
    
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(40);
        Node<Integer> n5 = new Node<Integer>(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        // // increment(head);
        // // print(head);
        // System.out.println(countNode(head));
        // printIthNodeData(head, 3);
        // Node<Integer> head = takeInput();
        // Node<Integer> head = insertNode(n1, 3, 100);
        // print(head);
        // print(n1);
        // System.out.println();
        // Node<Integer> head = deleteNode(n1, 4);
        // print(head);
        print(n1);
        System.out.println();
        Node<Integer> head = appendLastNNodeToFirst(n1, 2);
        print(head);
        

    }
}

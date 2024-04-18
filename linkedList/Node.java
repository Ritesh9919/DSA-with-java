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

    @SuppressWarnings("unchecked")
    public static Node<Integer> removeDublicates(Node<Integer> head) {
         if(head == null) {
            return head;
         }

         Node<Integer> currNode = head;

         while(currNode.next != null) {
            if(currNode.data.equals(currNode.next.data)) {
                currNode.next = currNode.next.next;
            }else{
                currNode = currNode.next;
            }
         }
         return head;
    }


    @SuppressWarnings("unchecked")
    public static void reverse(Node<Integer> root) {
        if(root == null) {
            return;
        }

        Node<Integer> curr = root;
        Node<Integer> prev = null;
        Node<Integer> next = curr.next;

        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }

        curr.next = prev;
        while (curr != null) {
            System.out.print(curr.data + "--> ");
            curr = curr.next;
        }
    }

    @SuppressWarnings("unchecked")
    public static Node<Integer> midNode(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

        
    @SuppressWarnings("unchecked")
    public static Node<Integer> reverseHalf(Node<Integer> head) {
        if(head == null) {
            return null;
        }

          
          Node<Integer> prev = null;
          Node<Integer> curr = head;
          Node<Integer> next = null;

          while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
            
          }
          
          return prev;


    }

    @SuppressWarnings("unchecked")
    public static boolean isPalindrome(Node<Integer> head) {
        if(head == null) {
            return true;
        }

        Node<Integer> mid = midNode(head);

        Node<Integer> right = reverseHalf(mid);
        Node<Integer> left = head;

        while(left!= null && right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    public static void printRecursive(Node<Integer> head) {
        if(head == null) {
            return;
        }
        System.out.print(head.data + "-->");
        printRecursive(head.next);
    }

    public static Node<Integer> insertRec(Node<Integer> head, int pos, int data) {
        Node<Integer> newNode = new Node<Integer>(data);
        if(head == null && pos > 0) {
            return head;
        }
        if(pos == 0) {
            newNode.next = head;
            return newNode;
        }

        @SuppressWarnings("unchecked")
        Node<Integer> updatedHead = insertRec(head.next, pos-1, data);
        head.next = updatedHead;
        return head;

    }


    @SuppressWarnings("unchecked")
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        if(head == null) {
            return head;
        }

        if(pos == 0) {
            return head.next;
        }

        head.next = deleteNodeRec(head.next, pos-1);
        return head;
    }
    
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<Integer>(10);
        Node<Integer> n2 = new Node<Integer>(20);
        Node<Integer> n3 = new Node<Integer>(30);
        Node<Integer> n4 = new Node<Integer>(20);
        Node<Integer> n5 = new Node<Integer>(11);
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
        // Node<Integer> head = appendLastNNodeToFirst(n1, 2);
        // print(head);
        // Node<Integer> head = removeDublicates(n1);
        // print(head);
        // reverse(n1);
        // Node<Integer> head = reverseHalf(n1);
        // print(head);
        // System.out.println(isPalindrome(n1));
        // printRecursive(n1);/
        Node<Integer> head = insertRec(null, 0, 11);
        print(head);
        
        

    }
}

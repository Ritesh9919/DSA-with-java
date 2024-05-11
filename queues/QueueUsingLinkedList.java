package queues;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}



public class QueueUsingLinkedList {

//Define the data members
private Node head;
private Node tail;
private int size;



public QueueUsingLinkedList() {
    //Implement the Constructor
    head = null;
    tail = null;
    size = 0;
}



/*----------------- Public Functions of Stack -----------------*/


public int getSize() { 
    //Implement the getSize() function
    return size;
}


public boolean isEmpty() { 
    //Implement the isEmpty() function
    return size == 0;
}


public void enqueue(int data) {
    //Implement the enqueue(element) function
    Node newNode = new Node(data);
    size++;
    if(head == null) {
        head = newNode;
        tail = newNode;
        return;
        
    }

    tail.next = newNode;
    tail = newNode;
    
}


public int dequeue() {
    //Implement the dequeue() function
    if(size == 0) {
        return -1;
    }

    

    int temp = head.data;
    head = head.next;
    if(head == null) {
        tail = null;
    }
    size--;
    return temp;
}


public int front() {
    //Implement the front() function
    if(size == 0) {
        return -1;
    }
    return head.data;
}
}

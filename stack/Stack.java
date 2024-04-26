package stack;

public class Stack {
    private int[] data;
    private int topIndex;

    public Stack() {
        this.data = new int[10];
        this.topIndex = -1;
    }

    public int size() {
       return topIndex + 1;
    }

    public boolean isEmpty() {
      return topIndex == -1;
    }

    public void push(int ele) throws StackFullException {
        if(topIndex == data.length-1) {
          throw new StackFullException();
        }
         data[++topIndex] = ele;
         

    }

    public int top() throws StackEmptyException {
         if(topIndex == -1) {
            throw new StackEmptyException();
         }

         return data[topIndex];
    }

    public int pop() throws StackEmptyException {
       if(topIndex == -1) {
        throw new StackEmptyException();
       }

       int temp = data[topIndex];
       topIndex--;
       return temp;
    }
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.size());
        // System.out.println(s.top());
        // System.out.println(s.isEmpty());

        
        // while (!s.isEmpty()) {
        //     System.out.print(s.top() + " ");
        //     System.out.println(s.size());
        //     s.pop();
        // }
        
    }
}

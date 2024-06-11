package queues;
import java.util.LinkedList;
import java.util.Queue;;

public class ReverseQueue {

    public static void reverse(Queue<Integer> input, int k) {
         if(input.isEmpty()) {
            return;
         }

         int temp = input.remove();
         reverse(input, k);
         input.add(temp);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q, 3);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

    }
}

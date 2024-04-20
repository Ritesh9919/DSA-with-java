package linkedList;
import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(1, 12);
    //    System.out.println(list.size());
    //    System.out.println(list.get(1));
    for(int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + "-->");
    }
    }
}

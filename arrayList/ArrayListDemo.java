package arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(1, 50);
        arr.remove(1);
        arr.set(1, 10);
        // System.out.println(arr.size());
        // System.out.println(arr.get(2));

        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}

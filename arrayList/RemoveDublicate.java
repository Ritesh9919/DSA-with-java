package arrayList;

import java.util.ArrayList;

public class RemoveDublicate {
    public static ArrayList<Integer> removeDublicate(int[] arr) {
       ArrayList<Integer> result = new ArrayList<>();

       result.add(arr[0]);

       for(int i = 1; i < arr.length; i++) {
        if(arr[i] != arr[i-1]) {
            result.add(arr[i]);
        }
       }
       return result;
    }
    public static void main(String[] args) {
        int[] arr = {10,10, 30,4,5,6,6};
         ArrayList<Integer> result = removeDublicate(arr);

         for(int i: result) {
            System.out.print(i + " ");
         }
    }
}

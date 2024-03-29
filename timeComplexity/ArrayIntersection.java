package timeComplexity;
import java.util.*;

public class ArrayIntersection {

    public static void arrayIntersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
             if(arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
             }else if(arr1[i] < arr2[j]) {
                i++;
             }else{
                j++;
             }
        }


    }
    public static void main(String[] args) {
        int[] arr1 = {2,5,7,3};
        int[] arr2 = {4,7,5,9,6};
        arrayIntersection(arr1,arr2);
    }
}

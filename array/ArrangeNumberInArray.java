package array;
import java.util.*;

public class ArrangeNumberInArray {
    public static void arrangeNumber(int[]arr, int n) {
        int start = 0;
        int end = n-1;
        int element = 1;

        while(element <= n) {
            if(start == end) {
                arr[start] = element;
                return;
            }
            arr[start] = element++;
            arr[end] = element++;
            start++;
            end--;
        }

    

    }
    public static void main(String[] args) {
        int n = 11;
        int[] arr = new int[n];
        arrangeNumber(arr,n);

        System.out.println(Arrays.toString(arr));

    }
}

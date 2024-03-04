package array;
import java.util.*;

public class SwapAlternative {
    public static void swapAlternative(int[] arr) {
        int start = 0;
        while(start < arr.length-1){
            int temp = arr[start];
            arr[start] = arr[start+1];
            arr[start+1] = temp;
            start+=2;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,9,7};
        swapAlternative(arr);
        System.out.println(Arrays.toString(arr));

    }
}

package array;
import java.util.*;

public class SortZeroOne {

    public static void sortZeroAndOne(int[] arr) {
        int n = arr.length;
        int placeZero = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[placeZero];
                arr[placeZero] = temp;
                placeZero++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1};
        sortZeroAndOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}

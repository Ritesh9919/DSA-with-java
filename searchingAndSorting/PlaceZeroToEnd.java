package searchingAndSorting;

import java.util.Arrays;

public class PlaceZeroToEnd {

    public static void placeZeroToEnd(int[] arr) {
        int n = arr.length;
        int placeNonZeroHere = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                int temp = arr[placeNonZeroHere];
                arr[placeNonZeroHere] = arr[i];
                arr[i] = temp;
                placeNonZeroHere++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,0,1,3,0};
        placeZeroToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}

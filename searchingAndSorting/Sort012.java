package searchingAndSorting;

import java.util.Arrays;

public class Sort012 {

    public static void sort012(int[] arr) {
        int i = 0;
        int placeZero = 0;
        int placeTwo = arr.length-1;

        while(i <= placeTwo) {
            if(arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[placeZero];
                arr[placeZero] = temp;
                i++;
                placeZero++;
            }else if(arr[i] == 1) {
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[placeTwo];
                arr[placeTwo] = temp;
                placeTwo--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}

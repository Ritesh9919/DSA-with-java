package searchingAndSorting;

import java.util.Arrays;

public class RotateArray {
    public static void reverse(int[] arr, int startIndex, int endIndex) {
        while(startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int d = 2;

        reverse(arr, 0, arr.length-1);
       reverse(arr, 0, arr.length-d-1);
       reverse(arr, arr.length-d, arr.length-1);


        System.out.println(Arrays.toString(arr));

        // approach1
        // int[] temp = new int[d];

        // for(int i = 0; i < d; i++) {
        //     temp[i] = arr[i];
        // }

        // for(int i = 0; i < arr.length-d; i++) {
        //     arr[i] = arr[i+d];
        // }

        // for(int i = 0; i < d; i++) {
        //     arr[arr.length - d + i] = temp[i];
        // }
    }
}

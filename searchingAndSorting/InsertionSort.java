package searchingAndSorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[]arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,7,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

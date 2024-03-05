package searchingAndSorting;
import java.util.*;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,5,7,1,9,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

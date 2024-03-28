package recursion2;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int i = startIndex-1;

        for(int j = startIndex; j < endIndex; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[endIndex] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return;
        }

        int pivotIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivotIndex-1);
        quickSort(arr, pivotIndex+1, endIndex);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,6,2,4,9};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

package recursion2;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr, int startIndex, int mid, int endIndex) {
        int[] temp = new int[endIndex - startIndex +1];

        int i = startIndex;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= endIndex) {
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= endIndex) {
            temp[k++] = arr[j++];
        }

        for(k = 0, i = startIndex; k < temp.length; i++,k++) {
            arr[i] = temp[k];
        }
    }

    public static void mergeSort(int[] arr, int startIndex, int endIndex) {
        if(startIndex >= endIndex) {
            return;
        }

        int mid = startIndex + (endIndex - startIndex)/2;
        mergeSort(arr, startIndex, mid);
        mergeSort(arr, mid+1, endIndex);
        merge(arr, startIndex, mid, endIndex);
    }
    public static void main(String[] args) {
        int[] arr = {6,1,2,5,8};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}

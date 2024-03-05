package searchingAndSorting;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n) {
            if(arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }

        while(i < m) {
            result[k++] = arr1[i++];
        }

        while(j < n) {
            result[k++] = arr2[j++];
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,9};
        int[] arr2 = {3,5,7,9,10};

        int[] result = mergeTwoSortedArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}

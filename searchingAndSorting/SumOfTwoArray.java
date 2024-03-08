package searchingAndSorting;
import java.util.*;

public class SumOfTwoArray {

    public static void sumOfTwoArray(int[] arr1, int[]arr2, int[]output) {
        int idx1 = arr1.length-1;
        int idx2 = arr2.length-1;
        int idx3 = output.length-1;
        int carry = 0;

        while(idx1 >= 0 && idx2 >= 0) {
            int sum = arr1[idx1] + arr2[idx2] + carry;
            int tens = sum / 10;
            int unit = sum % 10;
            output[idx3] = unit;
            carry = tens;
            idx1--;idx2--;idx3--;
        }

        while(idx1 >= 0) {
            int sum = arr1[idx1] + carry;
            int tens = sum / 10;
            int unit = sum % 10;
            output[idx3] = unit;
            carry = tens;
            idx1--;idx3--;

        }

        while(idx2 >= 0) {
            int sum = arr2[idx2] + carry;
            int tens = sum / 10;
            int unit = sum % 10;
            output[idx3] = unit;
            carry = tens;
            idx2--;idx3--;

        }

        output[0] = carry;
    }
   public static void main(String[] args) {
      int[] arr1 = {9,7,6,1};
      int[] arr2 = {4,5,9};
      int[] output = new int[Math.max(arr1.length, arr2.length) + 1];
      sumOfTwoArray(arr1,arr2,output);
      System.out.println(Arrays.toString(output));
   }
    
}
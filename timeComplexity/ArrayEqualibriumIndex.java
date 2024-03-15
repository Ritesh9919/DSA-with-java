package timeComplexity;

public class ArrayEqualibriumIndex {
    public static int arrayEqualibriumIndex(int[] arr) {
         int totalSum = 0;
         for(int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
         }

         int leftSum = 0;
         int index = 0;

         while(index < arr.length) {
            int rightSum = totalSum - leftSum - arr[index];
            if(leftSum == rightSum) {
                return index;
            }
            leftSum = leftSum + arr[index];
            index++;
         }
         return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,9,3,2};
        System.out.println(arrayEqualibriumIndex(arr));

    }
}
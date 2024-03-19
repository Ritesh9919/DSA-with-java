package timeComplexity;

import java.util.Arrays;

public class TripletSumInArray {

    public static int tripletSumInArray(int[] arr, int num) {
        Arrays.sort(arr);
        int result = 0;

        for(int i = 0; i < arr.length-2; i++) {
            int low = i+1;
            int high = arr.length-1;
            while (low < high) {
                int currSum = arr[i] + arr[low] + arr[high];
                if(currSum == num) {
                    result++;
                    int tmpHight = high-1;
                    while (tmpHight > low) {
                        if(arr[tmpHight] == arr[high]) {
                            result++;
                            tmpHight--;
                        }else{
                            break;
                        }
                    }
                    low++;
                }else if(currSum > num) {
                    high--;
                }else{
                    low++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,3,6};
        int num = 6;
        System.err.println(tripletSumInArray(arr,num));
    }
}

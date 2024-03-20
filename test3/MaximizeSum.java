package test3;

public class MaximizeSum {

    public static int maximizeSum(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;
        int maxSum = 0;

        int currSum1 = 0;
        int currSum2 = 0;

        while(i < n && j < m) {
            if(arr1[i] < arr2[j]) {
                currSum1 += arr1[i];
                i++;
            }else if(arr1[i] > arr2[j]) {
                currSum2 += arr2[j];
                j++;
            }else{
                maxSum += Math.max(currSum1, currSum2);
                maxSum += arr1[i];
                currSum1 = 0;
                currSum2 = 0;
                i++;j++;
            }
        }

        while (i < n) {
            maxSum += arr1[i];
            i++;
        }

        while (j < m) {
            maxSum += arr2[j];
            j++;
        }

        maxSum += Math.max(currSum1, currSum2);
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 15, 20, 25};
        int[] arr2 = {2, 4, 5, 9, 15};
        System.out.println(maximizeSum(arr1,arr2));
    }
}

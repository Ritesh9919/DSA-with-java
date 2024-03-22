package recursion1;

public class SumOfArray {

    public static int sumOfArray(int[] arr, int index) {
        if(index == arr.length) {
            return 0;
        }

        int smallOutput = sumOfArray(arr, index+1);
        int output = arr[index] + smallOutput;
        return output;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sumOfArray(arr, 0));
    }
}

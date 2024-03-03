package array;


public class ArraySum {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1};
        System.out.println(arraySum(arr));
    }
}

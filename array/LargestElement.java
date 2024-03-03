package array;

public class LargestElement {

    public static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {4,6,8,2,9};
        System.out.println(largestElement(arr));
    }
}

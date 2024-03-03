package array;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,1,9};
        int target = 1;
        System.out.println(linearSearch(arr,target));
    }
}

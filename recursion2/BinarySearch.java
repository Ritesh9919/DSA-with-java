package recursion2;

public class BinarySearch {

    public static int binarySearch(int[] arr, int startIndex, int endIndex, int x) {
        if(startIndex > endIndex) {
            return -1;
        }

        int midIndex = (startIndex + endIndex)/2;
        if(arr[midIndex] == x) {
            return midIndex;
        }

        if(arr[midIndex] < x) {
            return binarySearch(arr, midIndex+1, endIndex, x);
        }else{
            return binarySearch(arr, startIndex, midIndex-1, x);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,10,11};
        System.out.println(binarySearch(arr, 0, arr.length-1, 8));
    }
}

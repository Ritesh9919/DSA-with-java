package searchingAndSorting;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] < target) {
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,10};
        int target = 11;
        System.out.println(binarySearch(arr,target));
    }
}

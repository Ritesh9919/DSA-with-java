package searchingAndSorting;

public class SecondLargest {

    public static int secondLargest(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4,7,2,9};
        System.out.println(secondLargest(arr, arr.length));
    }
}

package test3;

public class FindLeaderInArray {

    public static void findLeaderInArray(int[] arr) {
        int maxRight = arr[arr.length-1];
        System.out.print(maxRight + " ");

        for(int i = arr.length-2; i >= 0; i--) {
            if(maxRight <= arr[i]) {
                maxRight = arr[i];
                System.out.print(maxRight + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,6,7,2,1,9};
        findLeaderInArray(arr);
    }
}

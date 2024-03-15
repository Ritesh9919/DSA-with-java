package timeComplexity;

public class FindUnique {
    public static int findUnique(int[] arr) {
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,1,3,6};
        System.out.println(findUnique(arr));
    }
}

package array;

public class PairSum {

    public static int pairSum(int[] arr,int x) {
        int ans = 0;
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == x) {
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,6,2,5,4,3,2,4};
        int x = 7;
        System.out.println(pairSum(arr,x));
    }
}

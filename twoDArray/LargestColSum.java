package twoDArray;

public class LargestColSum {

    public static int largestColSum(int[][] mat) {
        int largest = Integer.MIN_VALUE;
        int col = mat[0].length;
        int row = mat.length;

        for(int i = 0; i < col; i++) {
            int sum = 0;
            for(int j = 0; j < row; j++) {
                sum += mat[j][i];
            }
            if(sum > largest) {
                largest = sum;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{2,3,4},{1,2,1}};
        System.out.println(largestColSum(mat));
    }
}

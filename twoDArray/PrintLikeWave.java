package twoDArray;

public class PrintLikeWave {

    public static void printLikeWave(int[][] mat) {
        if(mat.length == 0) {
            return;
        }

        for(int i = 0; i < mat[0].length; i++) {
            for(int j = 0; j < mat.length; j++) {
                if(i % 2 == 0) {
                    System.out.print(mat[j][i] + " ");
                }else{
                    System.out.print(mat[mat.length-1-j][i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        printLikeWave(mat);
    }
}

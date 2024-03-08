package twoDArray;
import java.util.*;

public class inputAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();

        int[][] arr2d = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.println("Enter the element at " + i + " row " + j + " column");
                arr2d[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++ ) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}

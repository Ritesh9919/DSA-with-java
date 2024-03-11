package twoDArray;

public class SumOfBoundaryAndDiagonal {
    public static int sumOfBoundaryAndDiagonal(int[][] mat) {
        int sum = 0;

		

		// top and bottom sum 
		for(int i = 0; i < mat.length; i++) {
			// top
			sum += mat[0][i];
			// bottom
			sum += mat[mat.length-1][i];
		}

		// left amd right sum
		for(int i = 1; i < mat.length-1; i++) {
			// left
			sum += mat[i][0];
			// right
			sum += mat[i][mat.length-1];
		}

		// diagnol sum
		  for(int i = 1; i < mat.length-1; i++) {
			  // left
			  sum += mat[i][i];
			  if(i != mat.length-1-i) {
				  sum += mat[i][mat.length-1-i];
			  }
		  }
          return sum;
    }
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        System.out.println(sumOfBoundaryAndDiagonal(mat));
    }
}

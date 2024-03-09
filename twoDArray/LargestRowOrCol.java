package twoDArray;

public class LargestRowOrCol {
    public static void findLargest(int mat[][]){
		//Your code goes here
		int max = Integer.MIN_VALUE;
		boolean isRow = true;
		int index = -1;

		

		if(mat.length == 0) {
			System.out.print("row " + 0 + " " + Integer.MIN_VALUE);
			return;
		}


		// row wise max sum
		for(int i = 0; i < mat.length; i++) {
			int sum = 0;
			for(int j = 0; j < mat[0].length; j++) {
				sum += mat[i][j];
			}
			if(sum > max) {
				max = sum;
				index = i;
			}
		} 

		// col wise max sum
		for(int j = 0; j < mat[0].length; j++) {
			int sum = 0;
			for(int i = 0; i < mat.length; i++) {
				sum += mat[i][j];
			}
			if(sum > max) {
				max = sum;
				isRow = false;
				index = j;
			}
		}

        if(isRow) {
           System.out.println("row " + index + " "  + max);
		}else {
			System.out.println("column " + index + " "  + max);
		}
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{2,3,4},{3,4,5}};
        findLargest(mat);
    }
    
}

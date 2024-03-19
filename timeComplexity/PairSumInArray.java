package timeComplexity;

import java.util.Arrays;

public class PairSumInArray {

    public static int pairSumInArray(int[] arr, int num) {
        Arrays.sort(arr);

		int startIndex = 0;
		int endIndex = arr.length-1;
		int numPairs = 0;

		
		

		
		while(startIndex < endIndex) {
			if(arr[startIndex] + arr[endIndex] < num) {
				startIndex++;
			}else if(arr[startIndex] + arr[endIndex] > num) {
				endIndex--;
			}else{
				int elementAtStart = arr[startIndex];
				int elementAtEnd = arr[endIndex];
				if(elementAtStart == elementAtEnd) {
					int elementCount = (endIndex - startIndex+1);
					numPairs += (elementCount * (elementCount-1)/2);
					return numPairs;
				}
				int tempStartIndex = startIndex+1;
				int tempEndIndex = endIndex-1;
				while(tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
					tempStartIndex++;
				}

				while(tempStartIndex <= tempEndIndex && arr[tempEndIndex] == elementAtEnd) {
					tempEndIndex--;
				}

				int totalElementFromStart = (tempStartIndex - startIndex);
				int totalElementFromEnd = (endIndex - tempEndIndex);

				numPairs += (totalElementFromStart * totalElementFromEnd);
				startIndex = tempStartIndex;
				endIndex = tempEndIndex;

			}
			
		}
		return numPairs;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 5, 4, 3, 2, 4};
        int num = 7;
        System.out.println(pairSumInArray(arr,num));
    }
}

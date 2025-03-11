package SearchInMartix;

import java.util.Arrays;

public class TFsearchin2darray {

	public static void main(String[] args) {
        // Initialize a 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Define the target value to search for
        int target = 6;

        // Call the search method and print the result
        boolean result = searchMatrix(matrix, target);
        System.out.println("Target found: " + result);
    }
	
	static boolean searchMatrix ( int[][]matrix, int target)
	{
		int rowIndex = searchPotentialRow(matrix, target);
		
		if (rowIndex != -1)
			return binarySearchRow(rowIndex,matrix, target);
		else return false ;
	}
	
	static int searchPotentialRow ( int[][] matrix, int target)
	{
		int rowstart = 0 ;
		int rowend = matrix.length -1;
		while (rowstart <= rowend)
		{
			int mid = rowstart+ (rowend -rowstart)/2;
			
			if (matrix [rowstart][mid ] <= target && target<= matrix[mid] [matrix[0].length -1 ])
			{
				return mid ;
			}
			else if (matrix [mid ] [0]< target ) rowstart = mid +1;
			else if ( matrix [mid][0]> target) rowend = mid -1; 
		}
		return -1 ;
	}
	static boolean binarySearchRow(int rowIndex , int [][]matrix , int target)
	{
		int rowstart = 0 ; 
		int rowend = matrix[rowIndex].length -1; 
		while (rowstart <= rowend )
		{
			int mid = rowend +(rowend -rowstart)/2;
			
			if(matrix[rowIndex][mid]== target)
			{
				return true;
			}
			else if (matrix[rowIndex][mid] > target) rowend = mid -1 ;
			else rowstart = mid +1;
		}
		return false ;
		
	}
}

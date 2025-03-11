package SearchInMartix;

import java.util.Arrays;

public class RowColMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int [][] arr = {
				 {10,20,30,40},
				 {15,25,25,45},
				 {28,29,37,49},
				 {33,34,38,50}
		 };
		System.out.print(Arrays.toString(search(arr,37)) );
	}
 static int [] search (int [][] matrix, int target)
 {
	 int row = 0 ; int col = matrix.length -1 ;
	 
	 //case 1  ;element is == target (targe = 37 
	 
	 
	 //   [10,20 ,20 ,40 ]
	 
	 //   [11,25, 35 ,45]
	 // [28 ,29 ,37 , 49]
	 //[33,34,38,50]
	 //case 2 element is > target
	 
	 //case 3 element is < target 
	 
	 
	 while (row < matrix.length &&   col >= 0 )
	 {
		 if (matrix [row][col] == target )
		 { 
			 return new int [] {row,col};
		 }
		 
		 if (matrix [row][col]< target)
		 {
			 row ++;
		 }
		 else 
		 {
			 col --;
		 }
		 
	 }
	 return new int [] {-1,-1};
	 
 }
}

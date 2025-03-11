package bubblesort;

import java.util.Arrays;

public class bubblesortalgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr = {5,4,3,2,1};	
		int [] arr = {3,1,5,4,2};	
		//bubble(arr);
		selection (arr);
			System.out.print(Arrays.toString(arr));
	}
	
	
	static void bubble (int [] arr)
	{
		boolean swapped = false ;
		//ru nthe setps n -1 times 
		for (int i = 0 ; i< arr.length;i++)
		{
			for (int j = 1;j<arr.length -i ;j++)
			{
				//swap if the item is smaller than the previous item
				
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j];
					arr[j]= arr[j-1];
					arr[j-1]= temp;
					swapped = true;
				}
			}
			// if you didn't swap for a particular value of i , it meanst the arrays is sorted 
			// hence ttop the program 
			if (!swapped  )
			{
				break;
			}
		}
	}
}

package bubblesort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//int [] arr = {5,4,3,2,1};	
		int [] arr = {3,1,5,4,2};	
		//bubble(arr);
		selection (arr);
			System.out.print(Arrays.toString(arr));
	}
	static void selection (int [] arr)
	{ 
		for (int i = 0 ; i< arr.length ; i++)
		{
			//find the max item in the remianing array and sway with correct index
			int last = arr.length -i-1;
			int maxIndex = getMaxindex(arr, 0 , last);
			swap(arr,maxIndex , last);
		}
	}
	
	
	static void swap (int []arr,int first ,int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second ]= temp;
	}
	
	private static int getMaxindex(int [] arr, int start , int end )
	{ int max = start;
	 for (int i = start;i<=end;i++)
	 {
		 if(arr[max]< arr[i])
		 {
			max = i ; 
		 }
		
	 }
	 return max;
	 
	}
}

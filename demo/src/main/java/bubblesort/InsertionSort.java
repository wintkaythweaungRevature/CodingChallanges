package bubblesort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr = {5,4,3,2,1};	
				int [] arr = {4,5,1,3,2};	
				//bubble(arr);
				insertion (arr);
					System.out.print(Arrays.toString(arr));
	}
	static void insertion(int []arr)
	{ 
		for (int i = 0 ; i<arr.length -1; i++)
		{ 
			for (int j = i+1 ; j> 0 ;j--)
			{
				if(arr[j ]< arr[j-1])
				{
					swap (arr,j , j-1);
				}
				else 
				{ break; }
			}
		}
	}
	static void swap (int []arr,int first ,int second)
	{
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second ]= temp;
	}

}

package BinarySearch2;

public class infinitearray {

	public static void main (String []args)
	{
		int [] nums = {3,4,5,6,8,9, 10 , 11 ,13,20,21, 25,34,45,56,66};
		int target = 11;
		System.out.println( ans(nums, target) );
	}
	static int ans(int []nums , int target )
	{
		//first find the range
		//start with the box of size 2
		int start = 0;
		int end = 1;
		//condition for the target to lie in the range
		while (target >nums[end])
		{
			int temp = end+1 ;
			//double the box value
			// end = previousend + sizeofarray * 2 double the size of the first previous size of raay 
			end =end + (end - start + 1 )* 2 ;
			start= temp;
	}
		return search (nums,target ,start ,end);
	}
	static int search(int []nums,int target ,int start , int end) {
		
		
		while (start <= end)
		{
			int mid = start + (end-start)/2;
			if (target < nums[mid] )
			{
				end =mid -1;
			}
			
			else 
			{
				return mid;
			}
			
		}return -1;


	}
}

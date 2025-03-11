package BinarySearch2;

public class RBSrotatebinarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,5,0,1,2,3,4 };
		int target = 0;
		
System.out.println(finPivot(arr));
	}
	
	
	static int search(int []nums, int target, int start , int end)
	{
		int pivot = finPivot(nums);
		//if you can't find pivot , it menas array is not rotated 
		if (pivot == -1)
		{
			//just do nomal binary sarch
			return binarySearch(nums, target, 0,nums.length-1);
			
			
		}
		//if pivot is found , you have 2 aseding sorted arrrys 
		
		if(nums [pivot]== target)
		{
			return pivot;
		}
		//case 1 pivot element == target 
		//case 2 target > start 
		//case 3 target < start
		// we know all element is going to bigger than target
		if ( target >= nums[0])
		{
			return binarySearch(nums, target, 0, pivot - 1);
		}
		return binarySearch(nums, target, pivot+1, nums.length-1);
	}
	
	
static int binarySearch(int[]arr, int target , int start , int end) {
		
		while (start <= end)
		{ 
			int mid = start + (end-start)/2;
			if (target < arr[mid] )
			{
				end =mid -1;
			}
			else if (target > arr[mid])
			{
				start = mid +1;
			}
			else 
			{
				return mid;
			}
			
		}
		return -1;
	}
	static int finPivot (int [] arr)
	{
		int start = 0 ;
		int end = arr.length-1;
		while (start <= end )
		{
			int mid = start + (end -start)/2;
			// 4 cases over here
			
			if (mid <end && arr[mid] > arr[mid +1] )
			{
				return mid ;
			}
			if (mid > start &&arr[mid] < arr[mid -1] )
			{
				return mid-1 ;
			}
			if (arr[mid]<= arr[start])
			{
				end = mid -1 ;
			}
			// 
			else
			{
				
				start = mid +1;
			}
		}
		return -1;
	}
	
	
	static int duplicatepivot (int [] arr)
	{
		int start = 0 ;
		int end = arr.length-1;
		while (start <= end )
		{
			int mid = start + (end -start)/2;
			// 4 cases over here
			
			if (mid <end && arr[mid] > arr[mid +1] )
			{
				return mid ;
			}
			if (mid > start &&arr[mid] < arr[mid -1] )
			{
				return mid-1 ;
			}
			// if elements at mid, start , end are equal then just skop the duplicates
			
			if (arr[mid]== arr[start]&& arr[mid]==arr[end])
			{
				// skip the dupliates
				//Note : what if thse elements at start and end were the pivot?
				// check start is pivot 
				if (arr[start]>arr[start+1])// it means start is pivot 
				{
					return start;
				}
				start++;
				if(arr[end]< arr[end-1])
				{
					return end -1;
				}
				end--;
			}
			//left side is sorted and should be in right side 
			
			else if (arr[start]<arr[mid] || arr[start]== arr[mid]&& arr[mid]> arr[end])
			{
				start = mid +1 ;
			}
			else 
			{
				end = mid-1;
			}
		}
		return -1;
	}
	

}

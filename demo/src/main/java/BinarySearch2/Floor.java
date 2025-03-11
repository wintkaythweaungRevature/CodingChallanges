package BinarySearch2;

public class Floor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,5,9,14,16,18};
	     int target = 15;
	     int ans= binarySearch(arr, target);
	      
	     System.out.println("Binary Search result in unsorted : " + ans);  // Check this output
	}
	
	//return the index greatest number <=target
	
static int binarySearch(int[]arr, int target) {
		
		int start = 0;
		int end = arr.length-1;
		
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
		return end;
	}
}

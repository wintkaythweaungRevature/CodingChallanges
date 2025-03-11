package BinarySearch2;

public class findceilingnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,5,9,14,16,18,20};
	     int target = 17;
	     int ans= celing(arr, target);
	      
	     System.out.println("Binary Search result in unsorted : " + ans);  // Check this output
	}
	
	//return the index of smallest number >= target
	//return the index 
	//return -1 if there is no 
static int celing(int[]arr, int target) {
		// what if the target element is greater than the greatest number in the array 
	 if(target > arr[arr.length-1])
	 {
		 return -1;
	 }
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
		return start;
	}
}

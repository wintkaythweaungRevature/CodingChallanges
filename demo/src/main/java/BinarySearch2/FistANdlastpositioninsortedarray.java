package BinarySearch2;

public class FistANdlastpositioninsortedarray {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			}
	
	
	public int[] searchRange(int[] nums, int target)
	{
		int [] ans = {-1,-1};
		int start = search(nums, target, true);
		
		int end = search(nums, target, false);
		ans[0] = start;
		ans[1] = end ;
		return ans;
				}

//this funciton jsut return the index value of target

int search(int []nums,int target,boolean findstartindex) {
	//check for first occurance if target first
	int ans= -1;
	int start = 0;
	int end = nums.length-1;
	
	while (start <= end)
	{
		int mid = start + (end-start)/2;
		if (target < nums[mid] )
		{
			end =mid -1;
		}
		else if (target > nums[mid])
		{
			start = mid +1;
		}
		else 
		{
			ans= mid;
			if(findstartindex == true)
			{
				end = mid -1;
			}
			else {start = mid +1;}
		}
		
	}return ans;


}
}

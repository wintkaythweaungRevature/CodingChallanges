package BinarySearch2;

public class RotationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {4,5,6,1,2,3};
System.out.println(countRotation(arr));
	}
	
	private static int countRotation(int []nums) {
		int pivot = findpivot(nums);
		if(pivot == -1)
		{
			return 0 ;
		}
		else {
			return pivot +1;
		}
	}
private static int findpivot(int[] nums)
{
 int start = 0 ;
 int end = nums.length -1; 
 int mid = start +(end - start)/2;
 
 while (start<= end )
 {
	 if (mid > start && nums[mid] < nums[mid -1]  )
	 {
		return  mid - 1 ;
	 }
	 if ( mid < end  && nums[mid]> nums[mid+1])
	 {
		return mid ;
	 }
	 if ( nums[mid]<= nums[start])
	 {
		 end = mid -1;
	 }
	 else {
		 start = mid +1;
	 }
 }
 return -1;
}


static int findpivotduplicate(int []nums)
{
	int start = 0 ; int end = nums.length -1; int mid = start + (end-start)/2;

	while (start<= end)
	{
		if (mid < end && nums[mid]>nums[mid+1] )
		{
			return mid ;
		}
		if (mid >start && nums[mid]<nums[mid-1])
		{
			return mid -1;
		}
	
		
		// mid = start = end it means for duplicate array in that given array 
		
		if ( nums[mid]== nums[start] && nums[mid]== nums[end])
		{
			if (nums[start]>nums[start+1])
			{
				return start;
			}
			start++;
			if (nums[end]<nums[end-1])
			{
				return end -1 ;
			}
			end -- ;
		}
		

		
		
		else if (nums[start]< nums[mid] || nums[start]== nums[mid] && nums[mid]>nums[end])
		{
			start = mid +1;
			
		}
		
		else {
			end = mid -1; 
		}
		
	}
	return -1;
}
}

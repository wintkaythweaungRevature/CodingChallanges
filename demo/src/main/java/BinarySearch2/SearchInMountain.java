package BinarySearch2;

public class SearchInMountain {

	int search (int[]arr,int target)
	{
		int peak= peakIndexinMountainArray(arr);
		int firsttry = binarySearch(arr, target , 0 , peak);
		if (firsttry != -1)
		{
			return firsttry;
		}// try to search in second half
		return binarySearch(arr, target, peak+1 ,  arr.length-1);
	}
	
	static int binarySearch(int arr[], int target,int start ,int end)
	{
		
		
		//find wheter array is sorted or not 
//		boolean isASC;
//		if(arr[start]<arr[end])
//		{
//			isASC = true;
//		}
//		else {
//			isASC =false ;
//		}
		 boolean isASC = arr[start] <arr[end];
				while (start<= end)
		{
					int mid = start+(end-start)/2;
					
					
			 if(arr[mid] == target) {
						 return mid;
					 }
			 if(isASC)
			 {
				 if(target < arr[mid])
					{
						end = mid -1;
					}
					else 
					{
						start= mid +1;
					}
			 }

			
			 else {
				 if(target > arr[mid])
					{
						end = mid -1;
					}
					else {
						start= mid +1;
					}
			 }
			
		}return -1;
	}
	
	public int peakIndexinMountainArray(int []arr)
	{
		int start = 0 ; 
		int end = arr.length-1 ;
		
		while (start<end)
		{
			int mid = start + (end- start )/2;
			if(arr[mid]> arr[mid+1])
			{
				// you are in deceding part of array
				//this may be answer, but need to check left
				// this is why end!= mid -1;
				end = mid;
			}
			else 
			{//second part
				start = mid +1; //we know that {mid +1] > mid[element]
			}
			
		}
		//in the end ,start == end and point to the largest number beczo 2 checks 
		//start and end are always trying to find max element in the above 2 checks 
		//hence, when they are pointing to just one element , and that is one coz that is what the checks
		// more elaboration : at every point of time for start and end, they have the best possible answer till that time 
		//if we are saying that only one item is remaining, hence cuz of above line that is the best possible answer
	return start ; // or return  end as both are equal 
	}
}

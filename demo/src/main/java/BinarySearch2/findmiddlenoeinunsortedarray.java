package BinarySearch2;

public class findmiddlenoeinunsortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {99,80,75,22,11,10,5,2,-3};
	     int target = 22;
	     int ans= binarySearch(arr, target);
	      
	     System.out.println("Binary Search result in unsorted : " + ans);  // Check this output
	}
	static int binarySearch(int arr[], int target)
	{	int start = 0 ;
		int end = arr.length-1;
		
		
		
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
	

}

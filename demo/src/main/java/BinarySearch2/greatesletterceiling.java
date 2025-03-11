package BinarySearch2;

public class greatesletterceiling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	//return the index of smallest number >= target
	//return the index 
	//return -1 if there is no 
static int celing(char[]letters, char target) {
		// what if the target element is greater than the greatest number in the array 
	
		int start = 0;
		int end = letters.length-1;
		
		while (start <= end)
		{
			int mid = start + (end-start)/2;
			if (target < letters[mid] )
			{
				end =mid -1;
			}
			else 
			{
				start = mid +1;
			}
			
			
		}
		return letters[start % letters.length];
	}
}

package FindtheNumbers;

public class SearchInRange {
	 public static void main (String []args)
	    {
	        int [] arr = {23, 45 ,-1 ,2, 3 ,19 ,16};
	        int target = 23;
	       
			int ans = (linearSearch(arr, target, 1 , 4 ));
	        System.out.println(ans);

	    }
	    static int linearSearch(int[] arr, int target , int start, int end)
	    {
	        if (arr.length == 0)
	       { return -1;

	    }
	    for (int i = 0 ; start < end ;i++)
	    {
	        int element = arr[i];

	        if (element == target )
	        {
	            return i ;
	        }

	    }
	    return -1;
	}

}

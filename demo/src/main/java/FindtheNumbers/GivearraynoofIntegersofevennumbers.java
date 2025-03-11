package FindtheNumbers;


public class GivearraynoofIntegersofevennumbers {
	
	public static void main (String []args)
    {
        int [] nums = {12, 345 ,2 ,6, 7896 };
       
        System.out.println(findNumbsers(nums));
        System.out.println(digits(54637));

    }
	
	static int findNumbsers(int[]nums)
	{
		int count = 0 ;
		for (int num :nums)
		{
			if (even(num))
			{
				count++;
			}
		}
				return count ;
	}

	private static  boolean even(int num) {
		// TODO Auto-generated method stub
		int numofDigits = digits(num);
//		if (numofDigits %2 ==0 )
//		{
//			return true;
//		}
//		
//		return false;
		
		return numofDigits %2 == 0;
	}
	private static int digits (int num)
	{
		int count = 0 ;
		while (num > 0 )
		{
			count ++;
			num = num /10 ;
		}
		return count;
	}

}

package BinarySearch2;

public class finethewealthiestperson2Darray 
{
	public static void main (String[]args) {           
		
		 int[][] accounts ={ 
					{1, 2 ,3},
					{3, 2 ,1, }
		 				};
		
	
	
		 System.out.println(maximumWealth(accounts));}




static int maximumWealth(int[][] accounts)
{
	int ans = Integer.MIN_VALUE;
for( int rowperson = 0 ; rowperson <accounts.length;rowperson++)
	
{
	int sum = 0;
	for (int colaccount = 0 ; colaccount <accounts[rowperson].length ;colaccount ++ )
	{
		sum += accounts[rowperson][colaccount];
		
	}
	if (sum >ans)
	{
		ans= sum;
	}
}
return ans;

}
}

package FindtheNumbers;

public class findnfromthestring {
	 public static void main (String[]args)
	    {
	        String name = "Wint";
	        char target = 'k';
	       
	        System.out.println(SearchString(name, target));

	    }
	    static boolean SearchString(String str, char target)
	    {
	        if (str.length() == 0)
	       { return false;

	    }
	    for (int i = 0 ; i <str.length() ;i++)
	    {
	        int element = str.charAt(i);

	        if (element == target )
	        {
	            return true ;
	        }

	    }
	    return false;
	}

}

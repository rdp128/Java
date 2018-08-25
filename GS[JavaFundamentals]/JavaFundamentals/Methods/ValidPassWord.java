package Methods;

public class ValidPassWord {

	/**
	 *      Password rules:
			A password must have at least eight characters.
			A password consists of only letters and digits. - \\w
			A password must contain at least two digits. - \\d
		 
		 Notes:  1)(.*<< >>>.*) matches anywhere in string
		 		 2)At the end(<< >>)+ matches one or more
		 		 3)\\d - for digit
		 		 4)\\w - for [A-Za-z]
		 		 5){5,} - 5 or more
	 */
	public static void main(String[] args) 
	{
		String pass = "AxAf12A4e";
		   
		validate(pass);

	}
	
	public static void validate(String st)
	{
		String alpha = "\\w+";
		String towDigit = "\\d{2,}";
		
		if( st.length() >=8 && st.matches(alpha) )
		{
			System.out.println("You are agreeing to the above Terms and Conditions.");
		}
		else
		{
			System.out.println("Please check criteria to create valid password");
		}
	}

}

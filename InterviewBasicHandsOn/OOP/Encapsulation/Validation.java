package Encapsulation;

public class Validation 
{

	public static String validate(Login login)
	{
		String n=login.getName();
		String p=login.getPass();
		
		if(n.equals("Rohan") && p.equals("rdp"))	
		{
			return "Success";
		}
		else return "Invalid credentials";
				
	}
	
	public static boolean validateLength(Login login)
	{
		String n=login.getName();
		String p=login.getPass();
		
		if(n.length()==5 && p.length()==3)
		{
			return true;
		}
		else return false;
	}
	
}

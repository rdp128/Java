package Methods;

public class LeapYear {

	public static void main(String[] args) 
	
	{
		if(leapCount(300) == true)
		{
			System.out.println("yes it's leap year");
		}
		else System.out.println("Not leap year");

	}
	
	public static boolean leapCount(int n)
	{
		if( (n%4 == 0 && n%100 != 0) || n%400 == 0)
		{
			
			return true;
		}
		else
		{
			return false;
		}
		
	}

}

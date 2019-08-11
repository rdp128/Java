package Numbers;

public class PowerOf10 
{
	public static void main(String[] args) {
		
		System.out.println(isPower());
		
	}
	
	public static boolean isPower()
	{
		int n=10;
	
		while( n!= 0)
		{
			if (n%10 == 0) //if power of 5 then %5
			{
				n /=10; ////if power of 5 then /5
				
			}
			else return false;
		}
		
		return true;
	}

}

package Numbers;

public class TwinPrime 
{
	
	public static void main(String[] args) 
	{

		twinPrime(1, 100);
		
	}
	
	public static void twinPrime(int n1, int n2)
	{
		
		for(int i=n1; i<=n2-2; i++)
		{
			if(prime(i) == true && prime(i+2) == true)
			{
				System.out.println(i+ "," + (i+2));
			}
		}

	}
	
	
	public static boolean prime(int num)
	{
		int count=0;
	
		for (int i = 1; i <= num; i++)
			{
				if (num % i == 0)
				{
					count++;
					
				} 
			}
			if (count == 2) 
			{
				return true;
			}
			else return false;
					
	}


}

package Numbers;

public class Factorial {
	

	//Method 4 - using recursion
	public static void main( String[] args)
	{
			
		System.out.println(fact(7));
	}

	public static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n * fact(n-1);
		}
	}
	
	/*
	 * //Method 1 - using for loop increment

			public class factorial
			{
				int num=5,fact=1;
				for(int i=1; i<=num; i++)
				{
					fact *= i;
				}
			
				System.out.println(fact);
			
			}
			
			//Method 2 - using for loop decrement
			
			public class factorial
			{
				int num=5,fact=1;
				for(int i=num; i>=1; i--)
				{
					fact *= i;
				}
			
				System.out.println(fact);
			
			}
			
			//Method 3 - using while loop

			public class factorial
			{
				int num=5,fact=1;
				int j=1;
				while(j<=num)
				{
					fact *=j;
					j++;
			
				}
				System.out.println(fact);

			}

	 */

}

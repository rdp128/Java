package Numbers;

public class SumUntilSingleDigit 
{
	public static void main(String[] args) 
	{
		int n=12394;
		int sum=1 ,sum2=0;
		while(n > 9)
		{
			sum = 1;
			while (n > 0)
			{
				int l = n%10;
				sum *= l;
				n/=10;
			}
			n=sum;
			System.out.println("n"  +n);
		}
		
		System.out.println(sum);

	}

}

package Numbers;

public class ReverseFibionacci 
{

	public static void main(String[] args)
	{
		
		int a=5,b=3,c=0,sum=8;
		
		System.out.println(a);
		System.out.println(b);
		while(a != 0)
		{
			c=a-b;
			a=b;
			b=c;
			System.out.println(c);
			sum += c;
			
		}
		System.out.println("Sum : " + sum);
	}
	
}

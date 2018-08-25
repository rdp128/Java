package Numbers;

public class StrongNumber1To1000 {
	
	public static void main(String[] args) {
		
		int num =145,sum=0;
		int temp=num;
		StrongNumber st = new StrongNumber();
		
		for(int i=1 ; i<=1e6; i++)
		{
			num =i;
			while(num > 0)
			{
				int lastDigit = num%10; //1
				sum += st.fact(lastDigit);//120+24=144+1
				num /= 10;	//1
			}
			
			if(sum == i)
			{
				System.out.println(i + " ");
			}
			sum = 0;
		}

	}
	
	int fact(int i)
	{
		int f=1;
		for(int j=1 ; j<=i ; j++)
		{
			f *= j;
		}
		return f;
	}
	

}

package Numbers;

public class StrongNumber {

	public static void main(String[] args) {
	
		int num =145,sum=0;
		int temp=num;
		StrongNumber st = new StrongNumber();
		
		while(num > 0)
		{
			int lastDigit = num%10; //1
			sum += st.fact(lastDigit);//120+24=144+1
			num /= 10;	//1
		}
		
		if(sum == temp)
		{
			System.out.println(temp + " is Strong Number");
		}
		else System.out.println("No");

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

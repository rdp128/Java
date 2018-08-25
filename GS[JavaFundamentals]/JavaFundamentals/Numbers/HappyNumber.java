package Numbers;

public class HappyNumber {
	
	public static void main(String[] args) 
	{
		HappyNumber ts = new HappyNumber();
		
		System.out.println(ts.isHappy(19));
		
	}
		
	boolean isHappy(int no)	
	{
		int slow=no, fast = no, flag= 0;
		do
		{
			slow = digitSquare(slow);
			fast = digitSquare(slow);
			
		}while( slow != fast);

		if(slow == 1) 
		{
			return true;
		}
		else
		{
			System.out.println("NO");
			return false;
		}

		
	}
		
	int digitSquare(int n)
	{
		int sum=0;
		while(n>0)
		{
			int lastDigit = n%10;
			sum += lastDigit * lastDigit;
			n/=10;
		}
		return sum;
		
	}

}

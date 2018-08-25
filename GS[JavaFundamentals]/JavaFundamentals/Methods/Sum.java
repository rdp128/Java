package Methods;

public class Sum {

	public static void main(String[] args) {
		int num = 175;
		System.out.println("Sum is :" + sum(num));
	}
	
	public static int sum(int i)
	{
		int sum=0;
		while(i>0)
		{
			int lastDigit = i%10;
			sum += lastDigit;
			i/=10;
		}
		return sum;
	}

}

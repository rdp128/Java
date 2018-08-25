package String;

public class RecursionSimple {

	public static void main(String[] args) {
		
		System.out.println(factorial(3));

	}
	
	public static Integer factorial(Integer n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n * factorial(n-1);
		}
	}

}

package Numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 12345;
		int rev = 0; 
		while(num > 0)
		{
			int lastDigit = num %10;
			rev = rev *10 + lastDigit;
			num /= 10;
			
		}
		System.out.println(rev);
		
		long num1 = 123456789;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		

	}

}

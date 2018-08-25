package Numbers;

/*
 * A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. 
 * For example 3210, 7056, 8430709 are all duck numbers whereas 08237, 04309 are not.
 */
public class DuckNumber {

	public static void main( String[] args)
	{
		
		int num = 1000;
		
		String strNum = Integer.toString(num);
		int flag = 0;
		
		
		for(int i=1; i<strNum.length(); i++)
		{
			if(strNum.charAt(i) == '0')
			{
				
				flag = 1;
				break;
			}
			
		}
		
		if(flag == 1)
		{
			System.out.println("duck");
		}
		else System.out.println("No");
		
		
	}
}

package Numbers;

/*
 * In mathematics, an automorphic number is a number whose square "ends" in the same digits as the number itself.
 * For example, 52 = 25, 62 = 36, 762 = 5776, and 8906252 = 793212890625, so 5, 6, 76 and 890625 are all automorphic numbers.
 * 
 */

public class automorphicNumbers {
	
	public static void main( String[] args)
	{
		
		
		long i = 890625;
		
		long len = Long.toString(i).length();//1 
		
		
		
		long sq = (long) Math.pow(i, 2);//4
		
		long getLastDigit = Integer.parseInt(Long.toString(sq).substring((int) len)) ;//4
		
		
		//System.out.println(getLastDigit);
		
		
		if(getLastDigit == i)
		{
			System.out.println("yes");
		}
		
		
	}

}

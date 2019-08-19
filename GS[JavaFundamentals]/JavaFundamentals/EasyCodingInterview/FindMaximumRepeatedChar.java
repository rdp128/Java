package EasyCodingInterview;

/* Output:
 * Most Repeated Char: c
 * Starting Index <7,9>
 */
import java.util.HashMap;

public class FindMaximumRepeatedChar {

	public static void main(String[] args) 
	{
		findMaxChar("aabbbbbccccccccc", 'b');
	}
	
	public static void findMaxChar(String str , char c1)
	{
		char ch[] = str.toCharArray();
		
		int max= Integer.MIN_VALUE;

		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char c:ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
			
			if(hm.get(c)>max)
			{
				max=hm.get(c);
				c1=c;
			}
		}
		System.out.println("Most Repeated Char: "+ c1 + "\nStarting Index <" + str.indexOf(c1) +","+ max + ">");
	}
}

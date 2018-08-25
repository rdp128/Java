package String;


/* Step 1 : iterate through string 
 * Step 2 : if str.charAt(i) != ' ' (Not equal to space) then reverse it 
 * Step 3 : else add space to reverse
 * Step 4 : if last element equal to space then decrease lastElement--
 * Step 5 : print it
 */

public class PreservingSpace {

	public static void main(String[] args) {
		
		String str = "I love India";
		String rev = "";
		int lastElement = str.length()-1;
		
		for (int i = 0; i < str.length(); i++) 
		{
			
			if(str.charAt(i) != ' ')
			{
				if(str.charAt(lastElement) == ' ')
				{
					lastElement--;
				}
			
				rev += str.charAt(lastElement--);
			}
			else
			{
				rev += " ";
			}
		}
		System.out.println(rev);
	}

}

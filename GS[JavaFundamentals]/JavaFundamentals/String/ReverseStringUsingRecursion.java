package String;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		
		System.out.println(reverseString("HELLO"));

	}
	
	public static String reverseString(String str)
	{

		if( str.length() <= 1)
		{
			return str;
		}
		else 
		{
		  return reverseString(str.substring(1)) + str.charAt(0);
		}
	}

}

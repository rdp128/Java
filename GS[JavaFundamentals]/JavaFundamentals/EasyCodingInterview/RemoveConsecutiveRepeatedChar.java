package EasyCodingInterview;

/*
 * Logic:
 * 
 * Check 2nd character with 1st character 
 * if 2ndcharacter != 1st character then add it to Output String
 * set output string with 1st character.
 */
public class RemoveConsecutiveRepeatedChar {

	public static void main(String[] args) 
	{
		String str = "aaaabbbcccbbbaaaAA".toLowerCase();
		String output = str.valueOf(str.charAt(0));
		
		for(int i=1; i<str.length(); i++)
		{
			if(str.charAt(i) != str.charAt(i-1))
			{
				output += str.charAt(i);
			}
		}
		
		System.out.println(output);	

	}

}

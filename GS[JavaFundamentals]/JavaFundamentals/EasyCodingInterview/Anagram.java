package EasyCodingInterview;


import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
		String st[] = {"tea","ate","eat","aaple","java","vaja","cut","utc"};
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<st.length; i++)
		{
			for(int j=0; j<st.length; j++)
			{
				if(checkAnagram(st[i], st[j]) && i!=j)
				{
					list.add(st[i]);
					break;
				}
			}
		}
		
		System.out.println(list);

	}
	
	public static boolean checkAnagram(String st1, String st2)
	{
		boolean isAnagram=true;
		char ch1[]=st1.trim().toCharArray();
		char ch2[]=st2.trim().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return (Arrays.equals(ch1, ch2));
	}
}

package Methods;

public class CountVowel {

	public static void main(String[] args) 
	{
		CountVowel c = new CountVowel();
		String str = "w3resource "; //w3rsrc
		c.count(str);
	}

	public static void count(String str)
	{
		int count=0,count1=0,count2=0;
		
		char ch[] = str.toCharArray();
		
		String vowel="aeiouAEIOU";
		
		for(int i=0; i<ch.length; i++)
		{
			
			if(vowel.indexOf(ch[i])>=0)
			{
				count++;
			}
			/*if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' ||  ch[i] == 'o' || ch[i] == 'u')
			{
				count++;
			}*/
			
			else if(Character.isDigit(ch[i]))
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		System.out.println("Vowel "  + count);
		System.out.println("digit "  + count1);
		System.out.println("Consonant "  + count2);
		
	}
}

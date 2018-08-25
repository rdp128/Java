package String;

import java.util.Scanner;

public class VowelConsCount {
	public static void main(String args[]) {
		System.out.print("Enter a sentence :");
		Scanner in = new Scanner(System.in);
		String data = in.nextLine();
		char chArray[] = data.toCharArray();
		
		String vowels = "aeiouAEIOU";
		int vowelCount = 0;
		int consCount = 0 , digit =0;

		for(int i=0; i<chArray.length ; i++)
		{
			//System.out.println(vowels.indexOf(chArray[i]));
			if(vowels.indexOf(chArray[i]) >= 0)
			{
				vowelCount++;
			}
			else if(Character.isDigit(chArray[i]))
			{
				digit++;
			}
			
			else
			{
				consCount++;
			}
			
		}
		System.out.println("Vowel Count : " + vowelCount);
		System.out.println("Consonant Count : " + consCount);
		System.out.println("Didgit is " + digit);
	}
}
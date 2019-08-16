package EasyCodingInterview;

import java.util.HashMap;
import java.util.Scanner;

//If character is repeated then their index position is different 


public class FirstNonRepeating {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();
		
		find(data);

	}
	
	public static void find(String s)
	{
		
		
		int count =0;
		char c[] = s.toCharArray();
	
		HashMap <Character , Integer> hashMap = new HashMap<Character, Integer>();
		
		for (char ch : c) {
			if(hashMap.containsKey(ch))
			{
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			else 
			{
				hashMap.put(ch, 1);
			}
		}
		//System.out.println(hashMap);
		
		for (char ch1 : c) {
			if(hashMap.get(ch1) == 1)
			{
				System.out.println(ch1);
				break;
			}
			
		}
	}

}

package String;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateAndCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();
		
		char chArray[] = data.toCharArray();
		
		HashMap <Character,Integer> hashMap = new HashMap<Character,Integer>();
		
		for(char ch : chArray)
		{
			if(hashMap.containsKey(ch))
			{
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			else
			{
				hashMap.put(ch, 1);
			}
		}
		
		Set <Character> set = hashMap.keySet();
		
		for(Character keys: set)
		{
			if(hashMap.get(keys) > 1)
			{
				System.out.println("repeated character is : " + keys + "-->"+ hashMap.get(keys));
			}
			if(hashMap.get(keys) == 0)
			{
				System.out.println("NO repeated charecter found in givrn string");
			}
		}
		
	
	}

}

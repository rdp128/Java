package String;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingUSingHashMap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();
		
		int count =0;
		String splitArray[] = data.split("");
		
		
		HashMap <String , Integer> hashMap = new HashMap<String, Integer>();
		for (String str : splitArray) {
			
			if(!hashMap.containsKey(str))
			{
				hashMap.put(str, 1);
				count =1;
			}
			else
			{
				count++;
				hashMap.put(str, count);
				
			}
		}
		//System.out.println(hashMap);
		
		for (String string : splitArray) {
			if(hashMap.get(string) == 1)
			{
				System.out.println(string);
				break;
			}
			
		}

	}

}

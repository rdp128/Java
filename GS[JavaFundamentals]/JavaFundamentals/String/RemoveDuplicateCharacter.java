package String;

import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();

		String splitArray[] = data.split("");
		
		HashSet <String> hs = new HashSet<String>();
		
		data = "";
		for(String str : splitArray )
		{
			if( hs.add(str) == true)
			{
				data += str;
			}
		}
		System.out.println("after removing duplicate character from above string :" +data);
	}

}

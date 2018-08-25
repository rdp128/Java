package String;

import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicateValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();
		
		String splitArray[] = data.split("\\s");
		data= "" ;
		HashSet <String> hashSet = new HashSet<String>();
		
		for(String str : splitArray)
		{
			if(hashSet.add(str) == true)
			{
				data += str + " ";
			}
		}
		System.out.println(data);
	}

}

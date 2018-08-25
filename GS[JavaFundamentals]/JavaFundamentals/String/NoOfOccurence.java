package String;
import java.util.Scanner;

import java.io.IOException;

public class NoOfOccurence {
	
	public static void main(String[] args)  {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		
		System.out.println("Enter character to search:");
		char ch = sc.nextLine().charAt(0);
		sc.close();
		int count =0;
		for(int i=0 ; i<data.length(); i++)
		{
			char search = data.charAt(i);
			if( ch == search)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}

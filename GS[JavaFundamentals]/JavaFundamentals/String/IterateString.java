package String;

import java.util.Scanner;

public class IterateString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();
		
		for(int i=0 ; i<data.length(); i++)
		{
			System.out.println(data.charAt(i));
		}
		
	}

}

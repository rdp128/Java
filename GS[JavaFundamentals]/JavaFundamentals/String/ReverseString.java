package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String data = sc.nextLine();
		
		
		String reverseString = "";
		for(int i=data.length()-1 ; i>=0 ; i--)
		{
			
			reverseString += data.charAt(i);
			
		}
		
		System.out.print("Reverse String is: " + reverseString);
	}

}

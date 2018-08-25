package String;

import java.util.Scanner;

public class Plaindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();
		
		char chaArr[] = data.toCharArray();
		String reverseString = "";
		for(int i=data.length()-1 ; i>=0 ; i--)
		{	
			reverseString += data.charAt(i);
		}
		
		//System.out.print("Reverse String is: " + reverseString);
		
		if(reverseString.equals(data))
		{
			System.out.println(reverseString + "is plaindrome");
		}
		else
			System.out.println("Not plaindrome");

	}

}

package String;

import java.util.Scanner;

public class DisplayIndividualWordOfReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();
		
		String splitArray[] = data.split(" ");
		for(int i=splitArray.length-1 ; i>=0 ; i--)
		{
			System.out.println(splitArray[i]);
		}
	}

}

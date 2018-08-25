package String;

import java.util.Scanner;

public class DisplayIndividualCharacterOfReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();

		for (int i= data.length()-1 ; i>=0 ; i--) {
			
			char reverseCharacter = data.charAt(i);
			System.out.println(reverseCharacter);
			
		}
		
	}

}

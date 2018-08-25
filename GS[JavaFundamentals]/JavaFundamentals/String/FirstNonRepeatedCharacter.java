
package String;

//If character is repeated then their index position is different 
//If character is not repeated then their indexof() and lastIndexOf() is same

import java.util.Scanner;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();
		
		for(int i=0 ; i<data.length() ; i++)
		{
			if( data.indexOf(data.charAt(i)) == data.lastIndexOf(data.charAt(i)))
			{
				System.out.println(data.charAt(i));
				break;
			}
			
		}
		System.out.println("no unique character ");

	}

}

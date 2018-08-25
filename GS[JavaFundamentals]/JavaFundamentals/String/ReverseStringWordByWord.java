package String;

/*
 * Input - Rohan Patel
   Output -nahoR letaP 
   Reverse whole string: letaP nahoR
*/

import java.util.Scanner;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();
		
		String splitArray[] = data.split(" ");
		
		for(int i=0 ; i<splitArray.length ; i++)
		{
			String store = splitArray[i];
			
			String reverseWord ="";
			for( int j=store.length()-1 ;j >=0 ; j--)
			{
				 reverseWord += store.charAt(j);
			}
			System.out.print(reverseWord + " ");
		}
		
		//Reverse whole string 
		String rev = "";
		char ch[] = data.toCharArray();
		for(int i=0 ; i<ch.length ; i++)
		{
			rev = ch[i]+rev;
		}
		System.out.println("\nReverse whole string: " +rev);
		
	}

}

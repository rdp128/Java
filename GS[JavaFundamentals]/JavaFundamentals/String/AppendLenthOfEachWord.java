package String;

import java.util.Scanner;

public class AppendLenthOfEachWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		sc.close();
		
		String splitArray[] = data.split(" ");
		String store="";
		int length = 0;
		String s="";
		
		for(int i=0 ; i<splitArray.length ; i++)
		{
			
			length = splitArray[i].length();
			System.out.print(splitArray[i] + ":" +  length + " ");
		}
		
		//System.out.println(length);
	}

}

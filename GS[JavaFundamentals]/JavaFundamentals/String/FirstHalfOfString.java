package String;

import java.util.Scanner;

public class FirstHalfOfString {
	
	static Scanner sc = new Scanner (System.in);
	
	
	static String data = sc.nextLine();
	
	

	public static void main(String[] args) {
		
		System.out.println(firstHalf(data));
		
	}
	
	public static String firstHalf(String word)
	{
		System.out.println("Enter:");
		
		
		int halfLength = data.length()/2;
		
		String finalResult = data.substring(0, halfLength);
		
		return finalResult;
	}

}

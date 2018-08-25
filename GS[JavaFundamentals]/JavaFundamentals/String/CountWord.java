package String;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String:");
		String data = sc.nextLine();
		
		String st[] = data.split(" ");
		int count=0;
		for(int i=0; i<st.length ; i++)
		{
			count++;
			
		}
		System.out.println("Total word in string: " + count);
		sc.close();
	}

}

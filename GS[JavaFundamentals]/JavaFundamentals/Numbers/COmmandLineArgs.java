package Numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class COmmandLineArgs {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter numbers");
		
		String st = sc.nextLine();
		
		String [] str = st.split(" ");
		
		for(String value:  str)
		{
			
			list.add(value);
			System.out.println(value +  "-->>" +  value.length());
		}
		
	}
		
}

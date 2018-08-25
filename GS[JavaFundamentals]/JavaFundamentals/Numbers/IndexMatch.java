package Numbers;

import java.util.Scanner;

public class IndexMatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		String split[] = str.split(",");
		
		
		int value = -1;
		for (int i = 0; i < split.length; i++) {
			if(Integer.parseInt(split[i]) == i+1)
			{
			
				value = i+1;
				break;
			}
			
				
		}
		System.out.println(value);	
		
	}

}

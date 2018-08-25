package Numbers;

import java.util.Scanner;

public class CountPositiveNegativeZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char choice = 0;
		System.out.println("Enter number:");
		int num = sc.nextInt();
		int positive = 0, neg = 0, zero = 0;
		do{
			
			if (num > 0) {
				positive++;
			}
			
			System.out.print("Do you want to continue y/n? ");
			choice = sc.next().charAt(0);
		}
		
		while (choice == 'Y');{

		
		}
		
		System.out.println(positive);

	}
}

package Numbers;

import java.util.Scanner;

public class CyclicityOfNumber {

	public static void main(String[] args) 
	{
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int lastDigit = n%10;
		int cyclicity=1;

		for(int x=n*n; x%10 != lastDigit; )
		{
			cyclicity++;
			System.out.println(x + ":" + lastDigit);
			x=x*n;
		}
		
		System.out.println("Cyclicity is : " + cyclicity);
		

	}

}

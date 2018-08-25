package Numbers;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two integer: ");
		int num  = sc.nextInt();
		
		int mul= 0 , fact =1; 
		
		
		for(int i=1; i<=10; i++)
		{
			System.out.println( num + "x" + i + "=" + (num*i));
			//fact *= i;
		}
		//System.out.println(fact);
	}

}

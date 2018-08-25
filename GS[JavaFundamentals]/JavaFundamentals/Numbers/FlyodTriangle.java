package Numbers;

import java.util.Scanner;

public class FlyodTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numner of row to see magic");
		int num = sc.nextInt();
		int e = 25;
		for(int i=1 ; i<=num ; i++)
		{
			for( int j=1 ; j<=num-i ; j++)
			{
				System.out.print(" ");
			}
			
			for (int k=1 ; k<=2*i-1 ; k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}

package ForLoop;

import java.util.Scanner;

/* POEM:
 * if row==col OR(||) col+row == rowscount less then 1
 */
public class PatternX {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows that you want");
		int rowsCount = sc.nextInt();
		System.out.println("Enter symbol to be display");
		char display = sc.next().charAt(0);
		sc.close();
		for(int row=1; row<rowsCount; row++)
		{
			for(int col=1; col<rowsCount; col++)
			{
				if( row == col || col+row == rowsCount-1)
				{
					System.out.print(display);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

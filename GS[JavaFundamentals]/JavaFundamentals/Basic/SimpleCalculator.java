package Basic;

import java.util.Scanner;

public class SimpleCalculator {

	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Simple Calculator in java");
		String ans="";
		
		do{
			System.out.println("Enter Number 1 :");
			double num1 = sc.nextDouble();
			System.out.println("Enter Number 2 :");
			double num2 = sc.nextDouble();
			
			
			operation(num1, num2);
			
			System.out.println("Do you want to continue? (Y or N)");
			ans = sc.next();
		}while(ans.equals("Y"));
			
		
		sc.close();
	}
	
	public static void operation(double n1, double n2)
	{
		
		
		System.out.println("Please choose what you want to perform 1.Add 2.Sub 3.Mul 4.Divison" );
		
		int op = sc.nextInt();
		
		if(op == 1)
		{
			System.out.println("ANS is "+ (double)(n1+n2));
		}
		if(op == 2)
		{
			System.out.println("ANS is "+ (n1-n2));
		}
		if(op == 3)
		{
			System.out.println("ANS is "+ (n1*n2));
		}
		if(op == 4)
		{
			System.out.println("ANS is "+ (n1/n2));
		}
	
		
	}

}

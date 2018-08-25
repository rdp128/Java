package Numbers;

import java.util.Scanner;

public class FactorAndPerfect {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of number : "); 
		int num= sc.nextInt();
		int sum =0;
		System.out.println("factor is : ");
		for(int i=1 ; i<num ; i++)
		{
			if(num%i == 0 )
			{
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("sum is " + sum);
		if( num == sum)
		{
			System.out.println("its perfect number");
		}
		else
		{
			System.out.println("Not perfect number");
		}

	}

}

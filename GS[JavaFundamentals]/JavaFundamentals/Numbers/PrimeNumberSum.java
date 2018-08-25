package Numbers;

import java.util.Scanner;

public class PrimeNumberSum {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range to find prime number ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		int sum =0 ,count=0;
		
		for( int i=num1 ; i<=num2 ; i++)
		{
			int flag=0;
			for( int j=2 ; j<i ; j++)
			{
				if( i%j == 0)
				{
					flag=0;
					break;
				}
				else
				{
					flag =1;
				}
			}
			if(flag == 1  && i>=1)
			{
				System.out.println(i);
				sum += i;
				count++;
			}
		} 	
		System.out.println("total prime number in that range is " + count);
		System.out.println("Sum of prime numer is " + sum);
		
	}
}

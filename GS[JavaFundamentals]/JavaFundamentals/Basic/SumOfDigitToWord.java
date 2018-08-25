package Basic;

import java.util.Scanner;

public class SumOfDigitToWord {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		sum(num);
		
	}
	
	public static void converter(int m)
	{
		String st="";
		System.out.println("Each Letter of sum in digit");
		while(m != 0)
		{
			if( m < 10)
			{
				System.out.print(st+ oneToTen(m));
				break;
			}
			else if(m < 100)//m=12
			{
				System.out.print(st + oneToTen(m/10));
				m = m%10;
			}
			else if( m>=100 && m < 1000)//m=123
			{
				System.out.print(st + oneToTen(m/100));
				m = m%100;//23
			}
		}
	}
	
	public static String oneToTen(int n)//12
	{
		String str= "";
			while(n != 0)
			{
				if(n == 1)
				{
					str += "one";
					break;
				}
				else if(n == 2)
				{
					str += "Two";
					break;
				}
				else if(n == 3)
				{
					str += "Three";
					break;
				}
				else if(n == 4)
				{
					str += "Four";
					break;
				}
				else if(n == 5)
				{
					str += "Five";
					break;
				}
				else if(n == 6)
				{
					str += "Six";
					break;
				}
				else if(n == 7)
				{
					str += "Seven";
					break;
				}
				else if(n == 8)
				{
					str += "Eight";
					break;
				}
				else if(n == 9)
				{
					str += "Nine";
					break;
				}
			}
		
		return str;
	}
	
	public static void sum(int n)
	{
		int sum=0;
		while(n > 0)
		{
			int last = n%10;
			sum += last;
			n /= 10;
			
		}
		System.out.println("Sum is " +sum);
		converter(sum);
	}

}

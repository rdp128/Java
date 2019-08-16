package EasyCodingInterview;

import java.util.Scanner;

public class PowerOf10 {

	public static void main(String[] args) 
	{
		System.out.println("Enter No: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(isPower(n));
		sc.close();
	}
	
	public static boolean isPower(int n)
	{
		while(n>1)//20>1 || 2>1
		{
			if(n%10==0) // 20/10=0 ..Y ||2/10..N
			{
				n/=10; // 20/10=2 
			}
			else return false; //comes here
		}
		return true;
	}

}

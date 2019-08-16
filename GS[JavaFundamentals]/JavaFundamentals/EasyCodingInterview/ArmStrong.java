package EasyCodingInterview;

import java.util.Scanner;

//371...len=3 = 3^3 + 7^3 +1^3 = 27+343+1=371...Y
public class ArmStrong {

	public static void main(String[] args)
	{
		
		System.out.println("Enter No: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		isArmstrong(n);
		sc.close();

	}
	
	public static void isArmstrong(int n)
	{
		int len = Integer.toString(n).length();
		int sum=0,q,n1=n;
		
		while(n != 0) //371 != 0..Y ||37 !=0..Y
		{
			int digit=n%10; //1 ||7
			q = (int)Math.pow(digit, len); //q=1^3..1 || 7^3=343
			sum += q; //sum = 1 || sum 1+343=344
			n/=10; //37 ||3
		}
		System.out.println(sum);
		if(sum == n1)
		{
			System.out.println("Yes");
		}
		else System.out.println("N");
	}

}

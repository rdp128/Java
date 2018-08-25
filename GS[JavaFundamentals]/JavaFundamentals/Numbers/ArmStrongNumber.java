package Numbers;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : "); 
		
		int num= sc.nextInt();
		int sum=0,temp = num;
		int len = Integer.toString(num).length();
		
		while(num > 0)
		{
			int lastDigit = num%10;
			sum += Math.pow(lastDigit, len);
			num /= 10;
			
		}
		
		if(sum == temp)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
				
	}

}

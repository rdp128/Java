package Numbers;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two integer: ");
		int num1  = sc.nextInt();
		int num2  = sc.nextInt();
		
		int sum =0 ,count =0;
		int avg= 0;
		int temp =0;
		
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
			for (int i = num1; i <= num2; i++) {
				sum += i;
				count++;
				
			}
			avg = sum/count;
			System.out.println("Total " + sum);
			System.out.println("Average " + avg);
		}
		
		else
		{
			for (int i = num1; i <= num2; i++) {
				sum += i;
				count++;
			}
			avg = sum/count;
			System.out.println("Total " + sum);
			System.out.println("Average " + avg);
		}
		
	}

}

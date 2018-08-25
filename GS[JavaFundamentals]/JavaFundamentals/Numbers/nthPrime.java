package Numbers;

import java.util.Scanner;

public class nthPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n to compute the nth prime number: ");

		int nth = sc.nextInt();//5

		int  i;
		int num = 1;
		int count = 0;
		//num =1 , count=0 , 
		while (count < nth) 
		{
			num = num + 2;//2
			for (i = 1; i <= num; i++) //2<=2
			{
				if (num % i == 0)
				{
					System.out.println(num);
				}
			}
			if (i == num) {
				count = count + 1;
			}
		}
		//System.out.println("Value of nth prime: " + num);

	}

}

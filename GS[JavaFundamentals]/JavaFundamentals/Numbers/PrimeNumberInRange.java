package Numbers;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range to find prime number ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int temp = 0;
		int flag = 0;

		if (num1 > num2) 
		{
			temp = num1;
			num1 = num2;
			num2 = temp;

			
			for (int i = num1; i <= num2; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag = 0;
						break;
					} else {
						flag = 1;
					}

				}

				if (flag == 1) {
					System.out.println(i);
				}
			}
				
		}
		else
			if (num1 <= 2) {
				System.out.println("2");
				num1 = 3;
			}
			for (int i = num1; i <= num2; i++) {//5...50 |i=5
				for (int j = 2; j < i; j++) {//2... | j=2 2<5
					if (i % j == 0) {
						flag = 0;
						break;
					} else {
						flag = 1;
					}

				}

				if (flag == 1) {
					System.out.println(i);
				}
			}

	}

}

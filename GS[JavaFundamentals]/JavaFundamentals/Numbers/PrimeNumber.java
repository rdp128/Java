package Numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n1 = sc.nextInt();

		int flag = 1;
		int sum = 0;
		for (int i = 2; i < n1; i++) {

			if (n1 % i == 0) {//8
				flag = 0;
				break;
			}

		}
		if (flag == 1) {
			System.out.println(n1 + " is Prime");

		} else {
			System.out.println(n1 + " is not prime");
		}

	}

}

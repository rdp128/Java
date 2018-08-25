package Numbers;

import java.util.Scanner;

public class IndividualDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two integer: ");
		int num = sc.nextInt();

		while (num != 0) {
			int digit = num % 10;
			num = num / 10;
			System.out.println(digit);

		}

	}
}

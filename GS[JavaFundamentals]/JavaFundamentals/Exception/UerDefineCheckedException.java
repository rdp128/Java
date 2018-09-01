package Exception;

import java.util.Scanner;

public class UerDefineCheckedException {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		int money = 10000;
		System.out.println("Enter Withdraw amount: ");
		int withdraw = sc.nextInt();
		int remain = money - withdraw;
		System.out.println("Rmaining :" + remain);
		

	}

}

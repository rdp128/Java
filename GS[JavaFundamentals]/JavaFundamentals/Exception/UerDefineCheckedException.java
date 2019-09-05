package Exception;

import java.util.Scanner;

public class UerDefineCheckedException {

	public static void main(String[] args) 
	{
		CreateException obj = new CreateException();
		
		obj.atm(2000);
		
	}
}

class LowBalanceException extends Exception
{
	public LowBalanceException() {
		super("Insufficient Balance");
	}

}

class CreateException
{
	
	public void atm(int n) 
	{
		Scanner sc = new Scanner (System.in);
		
		int money = n;
		
		System.out.println("Enter withdraw amount: ");
		int withdraw = sc.nextInt();
		
		int remain = money - withdraw;
		
		if(remain < money)
		{
			try {
				throw new LowBalanceException();
			} catch (LowBalanceException e) {
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Rmaining Blance :" + remain);
		}
		sc.close();
	}
	
	
}

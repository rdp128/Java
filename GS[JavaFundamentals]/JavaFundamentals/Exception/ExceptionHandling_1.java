package Exception;

public class ExceptionHandling_1 {

	public static void main(String[] args)
	{
		System.out.println(AmountAdder.addAmounts( new Amount("Dollar", 2) ,new Amount("Dollar", 10) ));
	}

}

class CurrenctNotMatchException extends Exception
{
	public CurrenctNotMatchException() 
	{
		super("Currency Not Matched");
	}
	
}
class Amount
{
	String currency;
	int amount;
	
	public Amount(String currency, int amount) 
	{
		this.currency = currency;
		this.amount = amount;
	}
}

class AmountAdder
{
	static Amount addAmounts(Amount amount1, Amount amount2) 
	{
		if( !amount1.currency.equals(amount2.currency))
		{
			try {
				throw new CurrenctNotMatchException();
			} catch (CurrenctNotMatchException e) {
				System.out.println("Currency not matched 1 -");
			}
		}
		return new Amount ( "Balance:", 10 );
		
	}
	
}
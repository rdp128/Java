package Exception;

public class ExceptionHandling_1 {

	public static void main(String[] args)
	{
		Amount obj1 = new Amount("Dollar", 10);
		Amount obj2 = new Amount("Dollar", 20);
		
		System.out.println(AmountAdder.addAmounts(obj1, obj2));
		
	}

}

class CurrencyNotMatchException extends Exception
{
	public CurrencyNotMatchException() 
	{
		super("Currency Not Matched");
	}
	
}
class Amount
{
	String currency;
	int amount;
	
	public Amount(String c, int a) 
	{
		this.currency = c;
		this.amount = a;
	}
}

class AmountAdder
{
	static Amount addAmounts(Amount amount1, Amount amount2) 
	{
		if( !amount1.currency.equals(amount2.currency))
		{
			try 
			{
				throw new CurrencyNotMatchException();
			} catch (CurrencyNotMatchException e) 
			{
				System.out.println(e);
			}
		}
		
		return new Amount("HI" , (amount1.amount + amount2.amount));
		
	}
	
}
package Exception;

/* 
 * We have two option to handle User define exception
 * 1)Handled in Method where exception occur
 *   - in this case we handle it in  AmountAdder method
 * 2)Handled where we calling method that has exception
 *   - in this case we handle it in  ExceptionHandling_1 class where we calling AmountAdder Method
 * 3)Also if we don't want to handle we can throw it to JVM add throws CurrencyNotMatchException in both AmountAdder and  ExceptionHandling_1 
 *   But this is not good practice as we create user define exception to handle it ONLY.
 */
public class ExceptionHandling_1 {

	public static void main(String[] args) 
	{
		Amount obj1 = new Amount("Dollar", 10);
		Amount obj2 = new Amount("Dollar", 20);
		
		try {
			AmountAdder.addAmounts(obj1, obj2);
		} catch (CurrencyNotMatchException e) 
		  {
			System.out.println(e);
		  }		
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
	public static void addAmounts(Amount amount1, Amount amount2) throws CurrencyNotMatchException
	{
		if( !amount1.currency.equals(amount2.currency))
		{
			
				throw new CurrencyNotMatchException();
		}
		else
		{
			System.out.print("Currency Match Total: ");
			System.out.println(amount1.amount + amount2.amount);
		}
	}	
}
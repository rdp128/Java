package Exception;
/*
 * Inside a method if an exception raised and if you are not handling 
 * that exception then exception object will be propagated to caller 
 * then caller method is responsible to handle exception. This is
 * called Exception Propagation.
 * 
 */
public class ExceptionPropagation {

	public static void main(String[] args) 
	{
		ExceptionPropagation obj = new ExceptionPropagation();
		
		try
		{
			obj.getData();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not possible to divide by zero");
		}

	}
	
	void getData()
	{
		System.out.println("First");
		getData1();
		System.out.println("End first Method");
	}
	
	void getData1()
	{
		System.out.println("Second");
		int c=100/0;
		System.out.println("End Second Method");
	}

}

package Exception;

/* MUST TRY ALL OPTION IN BELOW PROG FOR BETTER UNDERSTANDING!
 * -it used to execute important code such as closing file/ closing connections
 * -it always execute weather exception handled or not?
 * -it will be last block in execution of prog.
 * -for each try block there can be many catch but only one finally block
 * -Finally not execute when - prog exists by System.exist() or fatal arror
 */
public class FinallyBlock {

	public static void main(String[] args) 
	{
		try
		{
			int c = 10/0;
			System.out.println("C : " + c);
			System.out.println("prog. Continue");
			
		}
		catch(ArithmeticException e)
		{
			int d = 12/0;
			System.out.println("Not Possible");
		}
		
		finally
		{
			int d = 12/0;
			System.out.println("Finally Block");
		}
		
		int d = 12/0;
		System.out.println("End of the prog.");
		
	}

}

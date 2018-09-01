package Exception;

/* in below code we define 3 exception in try block
 * -At a time only one exception can be handled if there is 2 exception 
 *  occur same time than only 1st one will be handled and prog. terminate
 *
 */
public class MultipleCatchBlock_1 {

	public static void main(String[] args) 
	{
		try
		{
			int a = 10/5;
			System.out.println(a);
			
			int array[] = new int[5];
			array[6] = 10;
			System.out.println(array[6]);
			
			String str = "Rohan";
			System.out.println(str);
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Not Possible 1");
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Not Possible 2");
		}
		
		catch (NullPointerException e)
		{
			System.out.println("Null Not Allowed");
		}

	}

}

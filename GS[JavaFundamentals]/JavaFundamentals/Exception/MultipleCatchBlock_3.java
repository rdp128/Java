package Exception;

/* Most Specific to more general rule example
 * Mean if we declare Exception e first then we got compile time error. 
 *
 */
public class MultipleCatchBlock_3 {

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
		
		catch (Exception e)
		{
			System.out.println("Null Not Allowed");
		}

	}

}

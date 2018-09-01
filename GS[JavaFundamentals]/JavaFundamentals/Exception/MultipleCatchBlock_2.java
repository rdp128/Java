package Exception;

/* In below example we use Exception class instead of Specific exception
 * class we can use Exception if we don't know what exception will be
 * occur. 
 * 
 * -Exception class handle all type of exception.
 */
public class MultipleCatchBlock_2 {

	public static void main(String[] args) 
	{
		try
		{
			int a = 10/5;
			System.out.println(a);
			
			int array[] = new int[5];
			array[3] = 10;
			System.out.println(array[3]);
			
			String str = null;
			System.out.println(str);
		}
			
		catch (Exception e)
		{
			System.out.println("Not Possible");
		}

	
	}
}

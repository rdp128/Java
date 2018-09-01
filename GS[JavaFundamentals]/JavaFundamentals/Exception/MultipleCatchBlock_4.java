package Exception;

/* Multi Catch block features in JAVA 1.7 
 * Rule - if we declare multi catch exception then it doen't have parent
 * child or child-parent relationship. mean we can't declare Exception |
 * AirthmeticException because it's parent-child
 * 
 */
public class MultipleCatchBlock_4 {

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
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e )
		{
			System.out.println("Not Possible 1");
		}
		
	
		catch (NullPointerException e)
		{
			System.out.println("Null Not Allowed");
		}
	}

}

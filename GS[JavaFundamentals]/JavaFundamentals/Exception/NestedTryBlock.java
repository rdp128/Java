package Exception;

public class NestedTryBlock {

	public static void main(String[] args) 
	{
		try
		{
			try
			{
				int a = 10/2;
				System.out.println(a);
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			int arr[] = new int[5];
			arr[6]=10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("End of prog.");
		
	}

}

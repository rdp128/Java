package Exception;

public class Test {

	public static void main(String[] args)
	{
		
		int a = 10/0;
		try
		{
			throw new Exception("Not Possible");
		} catch (Exception e) 
		{
			
			e.printStackTrace();
		}
	}
}

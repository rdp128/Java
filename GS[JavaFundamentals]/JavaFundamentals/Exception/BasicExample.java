package Exception;

//This is example of unchecked EXCEPTION

public class BasicExample {

	public static void main(String[] args) throws Exception
	{
		int a = 10;
		int b =0;
		
		try 
		{
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Can't divide by ZERO");
		}
		
	
	}

}

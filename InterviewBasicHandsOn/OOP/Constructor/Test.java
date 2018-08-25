package Constructor;

public class Test {
	
	Test()
	{
		this(10,20);
		System.out.println("NO args Constructor");
	}
	
	Test(int x)
	{
		this();
		System.out.println("One Args Constructor");
	}
	
	Test(int x , int y)
	{
		
		System.out.println("Two Args Constructor");
	}

	static public void  main(String[] args)
	{
		Test t = new Test(10);

	}

}

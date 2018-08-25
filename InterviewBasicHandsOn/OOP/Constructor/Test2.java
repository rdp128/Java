package Constructor;

public class Test2 {

	
	public Test2() 
	{
		this(20);
		System.out.println("no args");
	}
	
	public Test2(int x) 
	{
		
		System.out.println("one args");
	}
	
	
	public static void main(String[] args) 
	{
		Test2 t = new  Test2();
		
		
	}

}

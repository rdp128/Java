package Static;

//Overload Static Method - YES

public class StaticMethod {

	
	public static void main(String[] args) 
	{
		System.out.println("Main");
		staticMethod(20);
		staticMethod();
		
	}
	
	static void staticMethod()
	{
		System.out.println("Method 1- No args");
	}
	
	static void staticMethod(int x)
	{
		System.out.println("Method 2 - one args");
	}
	

}

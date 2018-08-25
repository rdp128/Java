package Static;

public class StaticBloackExample2 
{
	static String msg;
	static
	{
		msg = "static variable-1";
		System.out.println("Static block -1");
	}
	static
	{
		System.out.println("Static block -2");
	}
	static
	{
		System.out.println("Static block -3");
	}
	
	//static method
	public static void show()
	{
		System.out.println("static method : " + msg);
	}
	//constructor
	public StaticBloackExample2()
	{
		msg = "static variable";
		System.out.println("This is Constructor");
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Main..");
		StaticBloackExample2  obj = new StaticBloackExample2 ();
		obj.show();
		
	}

}

package Methods;

public class MethodCall {

	public static void main(String[] args) 
	
	{
		method1();
	}
	
	public static void method1()
	{
		method2();
	}
	
	public static void method2()
	{
		//st2="Method2";
		method3();
	}
	
	public static void method3()
	{
		System.out.println("Method3");
		
	}

}

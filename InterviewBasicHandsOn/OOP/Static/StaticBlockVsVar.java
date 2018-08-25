package Static;

public class StaticBlockVsVar {

	static int a =100;
	
	/*static 
	{
		System.out.println("Static block");
		System.out.println(StaticBlockVsVar.a);
	}*/
	
	static void method()
	{
		a=200;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Main..");
		StaticBlockVsVar s = new StaticBlockVsVar ();
		s.method();

	}
	
	
	
	/*static 
	{
		System.out.println("Static block");
		System.out.println(StaticBlockVsVar.a);
	}
	
	static int a =100;*/

}

package Methods;

public class MethodInsideMEthod {

	public static void main(String[] args)
	{
		System.out.println(greeting()); // call Last Method
		System.out.println(greeting("DRT")); //Call Second Method
		System.out.println(greeting("ROHAN","PATEL")); //call First Method
	}
	
	public static String greeting(String fName, String lName)
	{
		return "Hello " + fName +" " + lName+" Welcome!";
	}
	
	public static String greeting(String fName)
	{
		return greeting(fName,"");
	}
	
	public static String greeting()
	{
		return greeting("Rohan","");
	}

}

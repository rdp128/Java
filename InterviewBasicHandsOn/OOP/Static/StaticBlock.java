package Static;

//static block mean only static keyword is present

public class StaticBlock {
	
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");

	}
	
	static
	{
		System.out.println("Static block -2 ");
	}
	
	static
	{
		System.out.println("Static block -1");
	}


}

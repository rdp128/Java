package ThisVsSuper;


public class Child extends Parent
{
	Child()
	{
		this.fun();
		super.fun();	
	}
	public void fun()
	{
		
	System.out.println("Inside child class");
	}

}

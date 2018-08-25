/*
 * -We can not initiate abstarct class
 * 
 */
abstract class Human
{
	public abstract void walk();
	
	public void eat()
	{
		System.out.println("Human Can Eat");
	}
}

class Man extends Human
{
	public  void walk()
	{
		System.out.println("Man can WALK");
	}
}

class Woman extends Human
{
	public  void walk()
	{
		System.out.println("Woman can WALK");
	}
}


public class AbstractDemo {

	public static void main(String[] args) 
	{
		Human obj = new Woman();
		obj.walk();
	}
}

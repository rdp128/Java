
public class Organization {

	public static void main(String[] args) 
	{
		
		Manager obj1 = new Manager();
		SwipeCard obj2 = new SwipeCard();
		
		obj1.logIn(obj2);
		obj2.swipe(obj1);
		System.out.println(obj1.name());
		System.out.println(obj2.getNumber());

	}

}

class Manager
{
	
	void logIn(SwipeCard obj)
	{
		System.out.println( name() + " Log IN");
	}
	String name()
	{
		return "Raghav" ;
	}
}

class SwipeCard
{
	void swipe(Manager obj)
	{
		System.out.println("Swiped IN");
	}
	int getNumber()
	{
		int num = 101;
		return  num;
	}
}
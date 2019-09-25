

abstract class Bird
{
	void color()
	{
		System.out.println("Bird has some color");
	}
	abstract  void fly();
	abstract  void eat();
	
	public static void main (String[] args)
	{
		Bird b = new Parrot();//Holding child class object in parent abstract class reference
		b.eat();
		b.fly();
		
		Bird c = new Crow();
		c.eat();
		c.fly();
		
	}
}

class Parrot extends Bird
{
	void fly() {
		System.out.println("Parrot is flying");		
	}
	@Override
	void eat() {
		System.out.println("Parrot is eating");	
	}
}

class Crow extends Bird
{
	@Override
	void fly() {
	   System.out.println("crow is flying");		
	}

	@Override
	void eat() {
		System.out.println("Crow is eating");	
	}
	
}
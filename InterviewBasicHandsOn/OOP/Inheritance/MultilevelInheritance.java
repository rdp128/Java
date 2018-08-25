package Inheritance;

public class MultilevelInheritance
{

	public static void main(String[] args) 
	{
		Oneplus3 obj = new Oneplus3();
		obj.ram();
		
	}

}

class OneplusOne
{
	String camera1 = "10 px";
	void ram()
	{
		System.out.println("2GB");
	}
}

class Oneplus2 extends OneplusOne
{
	String camera2 = "12 px";
	void ram()
	{
		System.out.println("4GB");
	}
	
}

class Oneplus3 extends Oneplus2
{
	String camera3 = "14 px";
	void ram()
	{
		System.out.println("6GB");
		System.out.println("Oneplus One Camera 1 - " + camera1);
		System.out.println("Oneplus Two Camera 2 - " + camera2);
		System.out.println("Oneplus Threee Camera 3 - " + camera3);
	}
}
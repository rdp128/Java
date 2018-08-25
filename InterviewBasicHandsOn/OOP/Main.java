
class A 
{
	void a()
	{
		System.out.println("A");
	}
}

 class B extends A
{
	{
		System.out.println("B");
	}
}

class C 
{
	void a()
	{
		System.out.println("C");
	}
}

public class Main{

	public static void main(String[] args) 
	{
		B obj = new B();
		obj.a();

	}

}

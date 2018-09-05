package PassingWholeClass;

/*
 *  passing object as method --
 */
public class A {
	

	public static void main(String[] args) 
	{
		B ob = new B("DRT", 24);
		ob.print(ob);
	}

}

class B
{
	String name;
	int age;
	
	//constructor
	public B(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//method passing object of class B
	void print(B obj)
	{
		System.out.println("Name:" + name + " | Age:" + age);
	}
}

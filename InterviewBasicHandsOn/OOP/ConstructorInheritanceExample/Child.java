package ConstructorInheritanceExample;

public class Child extends Parent
{
	Child()
	{
		this(10);
		System.out.println("Child Zero Args");
	}
	Child(int x)
	{
		super();
		System.out.println("Child One Args");
	}


}	

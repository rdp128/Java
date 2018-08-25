package ConstructorInheritanceExample;

public class Parent 
{
	Parent()
	{
		this(20);
		System.out.println("Parent Zero Args");
	}
	Parent(int x)
	{
		
		System.out.println("Parent One Args");
	}

}

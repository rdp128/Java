package Inheritance;

public class HirarichalInheritance {

	public static void main(String[] args) 
	{
		Son obj = new Son();
		obj.disp();
		
		Daughter obj2 = new Daughter();
		obj2.disp();
	}

}

class Father
{
	String fName ="Dilip";
	void disp()
	{
		System.out.println("I'm Father");
	}
}

class Son extends Father
{
	String myName ="Rohan";
	
	void disp()
	{
		System.out.println("My Name " + myName);
		System.out.println("My father Name is "+ fName);
	}
}

class Daughter extends Father
{
	String myName ="DRT";
	void disp()
	{
		System.out.println("My Name " + myName);
		System.out.println("My father Name is "+ fName);
	}
}
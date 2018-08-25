package Inheritance;

public class MultipleInheritance {

	public static void main(String[] args) 
	{
		child1 c = new child1();
		c.disp();
	}

}

interface parent1
{
	String p1 = "Parent1";
	void disp();
}

class parent2
{
	String p2 = "Parent2";
}

class  child1 extends parent2 implements parent1 
{
	public void disp()
	{
		System.out.println(parent1.p1 + "\n" + p2);
	}
}
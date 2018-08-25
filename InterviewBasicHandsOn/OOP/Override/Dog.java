package Override;

//sub(child) class
public class Dog extends Animal
{
	
	int y=20;
	void disp()//override Method
	{
		super.disp();
		System.out.println("Sub Class "+ y);
	}

}

package ThisVsSuper;

public class SuperWithInstanceVarMethod {

	public static void main(String[] args) 
	{
		Son obj = new Son();
		obj.disp();
	}

}

class Father
{
	//int a =100;
	int a;
}

class Son extends Father
{
	int a;
	
	
	void disp()
	{
		super.a = 100;
		a=200;
		System.out.println("Sub class:" + a);
		System.out.println("Super class:" + super.a);
	}
	
}
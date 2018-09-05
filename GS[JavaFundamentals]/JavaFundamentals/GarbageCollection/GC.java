package GarbageCollection;

public class GC {

	public static void main(String[] args) 
	{
		createObject();

	}
	
	public static void createObject()
	{
		for(int i=0; i<10000000; i++)
		new Student();
	}

}

class Student
{
	
	static int created = 0;
	static int destroyed ;
	
	Student()
	{
		System.out.println("Object ceated : " + created++);
	}
	
	@Override
	protected void finalize() throws Throwable
	{
		System.out.println("Object destroyed : " + destroyed++);
	}
}



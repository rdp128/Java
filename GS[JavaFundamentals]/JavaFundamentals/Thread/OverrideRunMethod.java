package Thread;

class Thread1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
		}
			
	}
}

class Thread2 extends Thread
{
	@Override
	public void run()
	{
		for(int i=5; i<=10; i++)
		{
			System.out.println(i);
		}
			
	}
}

public class OverrideRunMethod 
{

	public static void main(String[] args) 
	{
		Thread1 t1 = new Thread1();
		t1.start(); //starting thread1 
		
		Thread2 t2 = new Thread2();
		t2.start(); //starting thread1 
		
		
		System.out.println("Main Thread");
		

	}
}

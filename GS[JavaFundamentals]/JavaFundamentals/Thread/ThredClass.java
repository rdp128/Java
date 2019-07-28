package Thread;

public class ThredClass
{
	public static void main(String[] args) 
	{
		
		firstThread t1 =new firstThread();
		
		
		secondThread t2 = new secondThread();
		
		t1.start();
		t2.start();
	
	}
	
}

class firstThread extends Thread
{
	public void run()
	{
		synchronized (this) {
			
		}printNumber();
	
	}
	public  static void printNumber()
	{
		for(int i=0; i<5; i++)
		{
			System.out.print( "t1 :" + i + " ");
		}
	}
	
}


class secondThread extends Thread
{
	public void run()
	{
		synchronized (this) {
			
		}printNumber();
	
	}
	public  static void printNumber()
	{
		for(int i=0; i<5; i++)
		{
			System.out.print(i + " ");

		}
		
	}
	
	
}
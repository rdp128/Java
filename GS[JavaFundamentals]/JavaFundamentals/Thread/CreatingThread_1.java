package Thread;

/* creating thread using extending thread class
 * when we start thread using start() method we don't really know which thread executing first. That decided by thread scheduler 
 * 
 */
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Child Thread");
		}
			
	}
}

public class CreatingThread_1 {

	public static void main(String[] args) 
	{
		MyThread t = new MyThread();
	
		t.start(); //starting thread using start method
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Main Thread");
		}

	}

}

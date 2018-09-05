package Thread;

/* join method : Here child thread waiting for main thread to execute
 * 
 */
class Thread104 extends Thread
{
	static Thread th;
	
	@Override
	public void run() 
	{
		for(int i=0; i<3; i++)
		{
			try {
				th.join();
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println("Child Thread");
		}
	}
}
public class JoinMethod_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		Thread104.th = Thread.currentThread(); //accessing th using class name because it'static variable
		
		Thread104 t2 = new Thread104();
		t2.start();
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Main Thread");
			
			Thread.sleep(2000);
			
		}
	}

}

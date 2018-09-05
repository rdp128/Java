package Thread;

/* join method : here main method waiting for child thread to execute
 * 
 */
class Thread103 extends Thread
{
	
	@Override
	public void run() 
	{
		for(int i=0; i<3; i++)
		{
			System.out.println("Child Thread");
			try {
				Thread.sleep(5000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}


public class JoinMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		Thread103 t2 = new Thread103();
		t2.start();
		t2.join(2000); //main thread is waiting for t2 thread if we provide join(2000) then if in 2 sec  child thread not finished then main thread is tarted
		
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Main Thread");
		}
	}

}

package Thread;

/* 
 *  we have to create own thread object as well as Thread class object
 *  because Runnable doen't have start() method. 
 * 
 * 
 */

class My_Thread implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class CreatingThread_2 {

	public static void main(String[] args) 
	{
		My_Thread myThread = new My_Thread(); // creating own thread object
		Thread t = new Thread(myThread); // Creating an object to thread class by passing your thread as an arguments
		
		t.start(); // starting thread
		for(int i=0; i<5; i++)
		{
			System.out.println("Main Thread");
		}

	}

}

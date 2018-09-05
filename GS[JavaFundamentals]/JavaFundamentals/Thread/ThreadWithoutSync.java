package Thread;

//Main Method
public class ThreadWithoutSync {

	public static void main(String[] args)
	{
		Thread105 th = new Thread105();
	
		Thread t1 = new Thread(th);
		Thread t2 = new Thread(th);
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();

	}

}

//create thread by extending Thread class
class Thread105 extends Thread
{
	@Override
	public synchronized  void run()
	{
		AnotherThread obj = new AnotherThread();
		obj.addNew(100);
	}
}

//Another Class
class AnotherThread
{
	public void addNew(int n)
	{
		Thread t = Thread.currentThread();
		
		for(int i=1; i<=5; i++)
		{
			System.out.println(t.getName() +" - " + (i+n));
		}
	}
	
	public static void TimeTosleep()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



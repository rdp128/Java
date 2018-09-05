package Thread;

class PriorityThread extends Thread
{
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getPriority());
	}

}
public class ThreadPriority {

	public static void main(String[] args) 
	{
		System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
		
		PriorityThread t = new PriorityThread();
		t.start();
		//t.setPriority(1);
		System.out.println("Child thread priority : " + t.getPriority());

	}

}

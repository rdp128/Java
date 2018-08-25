package Thread;

public class ThredClass {

	public static void main(String[] args) 
	{
		//MyThread  myThread = new MyThread();
		//myThread.start();
	}
	
	public class MyThread extends Thread
	{
		@Override
		public void run()
		{
			for(int i=0; i<100; i++)
			{
				System.out.println(i);
			}
		}
	}
}

package Thread;

/*  Main thread is responsible for main and start print 
 *  child thread mean Thread_1 responsible for only  run() method to print
 *  
 */
class Thread_1 extends Thread
{
	public void start()
	{
		super.start(); // if you comment out this line then only main & Run will print b/c Don't override start() method if you do then your thread is not running mean multi thread concept is not works.
		System.out.println("Start");
	}
	
	public void run()
	{
		System.out.println("Run");
	}
	
}
public class OverrideStartWithSuper 
{
   public static void main(String[] args)
   {
	   Thread_1 t = new Thread_1();
	   t.start();
	   
	   System.out.println("Main");
	
   }
}

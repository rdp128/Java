package Thread;

//To provide name we use this. Using Runnable interface
class Thread101 implements Runnable
{
   @Override
	public void run()
    {
	  System.out.println(Thread.currentThread().getName());
	}
   
 
}
public class ThreadConstructor {

	public static void main(String[] args) 
	{
		Thread101 t = new Thread101();
		Thread t1 = new Thread(t,"ROhan");
		t1.start();

	}

}

/*  	>> BY USING EXTENDING THREAD METHOD" <<		
 * 				package Thread;

				//To provide name we use " Thread101(String n)"
				class Thread101 extends Thread
				{
				   @Override
					public void run()
				    {
					  System.out.println(Thread.currentThread().getName());
					}
				   
				   Thread101(String n)
				   {
					   super(n);
				   }
				}
				public class ThreadConstructor {
				
					public static void main(String[] args) 
					{
						Thread101 t = new Thread101("DRT");
						t.start();
				
					}
				
				}

 * 
 */

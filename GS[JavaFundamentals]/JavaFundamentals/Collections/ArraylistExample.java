package Collections;



import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArraylistExample {
	
	
	public static void main(String[] args) {
		
	    final CopyOnWriteArrayList<String> list1 =  new CopyOnWriteArrayList<String>();
		
		
	    list1.add("1");
	    list1.add("2"); 
	    list1.add("3");
	    list1.add("4");
	    
	   new Thread()
	   {
		   public void run() 
		   {
			   Iterator<String> it = list1.iterator();
			   while(it.hasNext())
			   {
				   System.out.println(it.next());
			   }
			   
		   };
	   }.start();;
	   
	   new Thread()
	   {
		   public void run() 
		   {
			   System.out.println("Adding Rohan at index 1");
			   list1.add(1,"Rohan");
			   
		   };
	   }.start();;
		
	}
		
}

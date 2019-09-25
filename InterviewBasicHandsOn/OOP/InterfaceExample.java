/* Interface : When we have requirement specification then we use interface (e.g : Making new software in that we need to create thread so they created Runnable interface - with run())
 *  -all method are abstract so it provide 100% abstraction
 * 
 *  - interface only represent behavior of object because data is public static final so it's not state of any object
 *  
 *  - can not have constructor,static block
 *  
 *  - need to use implements
 * 
 *  - when we implements interface in our class we need to override method with public access modifier
 *  
 *  - we can extends interface called inheritance in interface
 *  
 *  - we can extends more then one interface yes called multiple inheritance
 *  
 *  ---------
 *  Abstract class: When we have implementation but not 100% then we can go for abstract class 
 *  (e.g.: Develop new software - in that we have 10 method to implement out of 10 we implemented 5 so far then we go for abstraction) 
 *  
 *  -We can have abstract method or not so it provide partially abstraction such as 0 to 10% 
 *  - abstract class represent state and behavior.
 *    abstarct class A
 *    {
 *       int x=5;  //state
 *       
 *       //behavior
 *       void show() {};
 *       
 *       abstract void display();
 *       
 *    }
 *  -can have constructor,static block
 *  -need to extends
 */

public class InterfaceExample {

	public static void main(String[] args) 
	{
		I i = new I() // Anonymous nested class : Without implementing interface we can override method
		{
			public void show() 
			{
			  System.out.println("Show");	
			}		
		};
      i.show();
	}
}

interface I
{
	void show();
}

//interface has no method but class has method
//By using parent class reference we never call child class method


/*public class InterfaceExample implements I{

	public void show()
	{
		System.out.println("Show");
	}
	public static void main(String[] args) 
	{
		I i = new InterfaceExample();
		//i.show(); //wrong because By using parent class reference we never call child class method
		i.toString(); //toString() is Object class method
		//in all interface class during compile time java will add all Object class method in Interface
			
	}
}

interface I
{
	
}*/

//

/*public class InterfaceExample implements I
{
	public static void main(String[] args) 
	{
		
	}

	public void show() 
	{
		System.out.println("Show");
	}
}

interface I
{
	String toString(); //not override this in child class
	//InterfaceExample class extends Object class
	void show();
	
}
*/

/*interface a
{
	
}
abstract class a1
{
	
}

interface b
{
	
}

interface c extends a ,b
{
	
}
class A extends a1 implements a,b
{
	
}
*/





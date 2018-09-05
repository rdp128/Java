package PassingWholeClass;

/* 
 *  Passing object as constructor
 * 
 */
public class AnotherExample {

	public static void main(String[] args) 
	{
		SecondClass obj = new SecondClass(10, 10, 10);
		SecondClass obj1 = new SecondClass(obj); //passing first object  as parameter 
		
		obj.height = 20; //setting new height
		obj.calculate();
		
		obj1.height =50;
		obj.calculate();
	}

}

class SecondClass
{
	
	double height,length,width;

	//first constructor
	public SecondClass(double h, double l, double w)
	{
		this.height = h;
		this.length = l;
		this.width = w;
	}
	
	//second constructor
	public SecondClass(SecondClass ob) //passing class object  as argument
	{
		this.height = ob.height;
		this.length = ob.length;
		this.width = ob.width;
	}
	
	//calculate method
	public void calculate()
	{
		System.out.println(length*height*width);
	}
}

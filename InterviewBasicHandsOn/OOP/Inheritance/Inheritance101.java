package Inheritance;
/* SuperClass and subclass both has same method name and 
 * create obj of subclass and have to call superclass with subclass method
 * user super keyword
 */
public class Inheritance101 {

	public static void main(String[] args) 
	{
		Laserman laserman= new Laserman(90, "RDP", 9); //all argument in order as same as Laserman Construcotr
		System.out.println(laserman.toString());
	}

}

class Character
{
	private int leval;
	private String name;
	
	public Character(int leval,String name ) {
		this.leval = leval;
		this.name = name;
	}
	public int getLavel() {
		return leval;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {  //Same method in Laserman
		return getName() + " " + getLavel();
	}
}

class Laserman extends Character
{
	private int numCharges;
	
	public Laserman(int numCharges, String name, int leval) 
	{
		super(leval, name);  // Argument name must be same as Character constructor argument name and all argument in order
		this.numCharges = numCharges;
	}
	public int getNumCharges() {
		return numCharges;
	}
	
	@Override
	public String toString() {
		
		//using super keyword to call character toString method followed by laserman toString method
		return  super.toString() + " " + getNumCharges();
	}
}
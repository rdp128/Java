package Inheritance;

public class HirarichalInheritance {

	public static void main(String[] args) 
	{
		Son son = new Son("Rohan", "Dilipbhai", 25);
		System.out.println("My Name : " + son.getMyName());		
		System.out.println("Father Name : " + son.getFatherName());
		System.out.println("My Age : " + son.getAge());
		
		Daughter daughter = new Daughter("DRT", "Dilipbhai");
		System.out.println("My Name : " + daughter.getDaughterName());		
		System.out.println("Father Name : " + daughter.getFatherName());
	}

}
class Father  //Super Class
{
	private String fName; //Private DataType
	
	public Father(String fName) //Constructor
	{
		this.fName = fName;
	}
	public String getFatherName()
	{
		return fName;
		
	}
}

class Son extends Father
{
	private String myName; //Private DataType
	private int age;
	public Son(String myName, String fName, int age) //Constructor
	{
		super(fName); //Calling SuperClass Constructor
		this.myName = myName;
		this.age = age;
	}
	
	public String getMyName()
	{
		return myName;
		
	}
	public int getAge()
	{
		return age;
		
	}
}

class Daughter extends Father
{
	private String daughterName; //Private DataType
	
	public Daughter(String daughterName, String fName) //Constructor
	{
		super(fName); //Calling SuperClass Constructor
		this.daughterName = daughterName;
	}
	
	public String getDaughterName()
	{
		return daughterName;
		
	}
}

//Using Getter and setter Method
/*public class HirarichalInheritance {

	public static void main(String[] args) 
	{
		Son son = new Son();
		son.setfName("Dilipbhai");
		son.setMyName("Rohan");
		
		System.out.println("My Name: " + son.getMyName() + " \nfather Name: " + son.getfName());
		
	}

}
class Father
{
	private String fName;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}
	
	
}

class Son extends Father
{
	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	
}

class Daughter extends Father
{
	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	
}*/
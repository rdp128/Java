
public class AggregationExample {

	public static void main(String[] args) 
	{
		Address ad = new Address(29, "Edison", "NJ", "USA");
		Student s = new Student(101, "Rohan", ad);
		System.out.println(s.rollNo);
		System.out.println(s.adr.city);

	}

}

class Student
{
	int rollNo;
	String sName;
	Address adr;
	public Student(int roll ,String name,Address a) 
	{
		this.rollNo = roll;
		this.sName = name;
		this.adr = a;
	}
}

class Address
{
	int streetNo;
	String city,state,country;
	
	Address(int street, String c, String s, String co)
	{
		this.streetNo = street;
		this.city = c;
		this.state = s;
		this.country = co;
	}
}


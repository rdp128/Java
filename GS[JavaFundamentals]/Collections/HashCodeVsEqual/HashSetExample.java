package HashCodeVsEqual;

/*  When we override HashCode() ,Equals() and toString() method?
 * - when we add user define object to our HashSet collection frameworks.
 *  
 *  Internally Working:
 *  -when we add rohan object to hashset it called our override hashcode method and return id - 111 as hashcode
 *   if id is same then hashcode is same for all and index will be same
 *  -to check index existence we need to override equal method as well
 *  
 */
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) 
	{
		HashSet<Employee> hs = new HashSet<Employee>();
		
		Employee rohan = new Employee(111, "Rohan");
		Employee kishan = new Employee(111, "R");
		Employee bhavin = new Employee(111, "Bhavin");
		
		hs.add(rohan);
		hs.add(kishan);
		hs.add(bhavin);
		
		System.out.println(hs);
	}

}

class Employee
{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return id + " " +name;
	}
	
	public int hashCode()
	{
		return id;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Employee)
		{
			Employee e = (Employee)o;
			if(this.id == e.id ) //&& this.name.equals(e.name) //if you want id and name are equal then don't add
			{
				return true;
			}
			else return false;
		}
		return false;
	}
}

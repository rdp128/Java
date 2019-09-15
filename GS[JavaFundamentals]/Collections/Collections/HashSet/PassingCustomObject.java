package Collections.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class PassingCustomObject
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Employee> hs = new LinkedHashSet<Employee>();
		
		Employee e1 = new Employee(111, "Rohan");
		Employee e2 = new Employee(111, "Kishan");
		Employee e3 = new Employee(112, "DRT");
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			Employee e = (Employee) i.next();
			e.show();
		}
		
		//e1.show();
		//System.out.println(hs);
	}
	
}

class Employee
{
	int id;
	String name;
	
	public Employee(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	/*public String toString()
	{
		return id + " " + name;
	}*/
	
	
	public void show()
	{
		
		System.out.println(id + " " + name);
		//System.out.println( "this" + this.id);
		
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof Employee)
		{
			Employee e = (Employee)o;
			//System.out.println("E "+ e.id);
			if(this.id == e.id)
			{
				return true;
			}
			else return false;
		}
		else return false;
		
	}
	
}

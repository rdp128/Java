package Collections.TreeSet.ComparableVsComparator;

import java.util.TreeSet;

public class TreeSetComparable {

	public static void main(String[] args) 
	{
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		Employee e1 = new Employee(2, "Rohan");
		Employee e2 = new Employee(1, "DRT");
		
		
		ts.add(e1);
		ts.add(e2);
		
		
		System.out.println(ts);

	}

}

class Employee implements Comparable
{
	int id;
	String name;
	
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int compareTo(Object o) 
	{
		Employee e = (Employee)o;
		if(this.id>e.id)
		{
			return 1;
		}
		else if(this.id<e.id)
		{
			return -1;
		}
		else	
		{
			return 0;
		}
	}
	
	@Override
	public String toString() {
		
		return id + " " + name;
	}
	
}

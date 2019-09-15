package Collections.TreeSet.ComparableVsComparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {

	public static void main(String[] args) 
	{
		Comparator c1 = new NameCompare();
		TreeSet<Emp> ts = new TreeSet<Emp>(c1);
		
		Emp e1 = new Emp(2, "Rohan");
		Emp e2 = new Emp(1, "DRT");
			
		ts.add(e1);
		ts.add(e2);	
		
		System.out.println( "Compare by name" + ts);
		
		Comparator c2 = new IdCompare();
		TreeSet<Emp> ts2 = new TreeSet<Emp>(c2);
		Emp te1 = new Emp(1, "Rohan");
		Emp te2 = new Emp(2, "DRT");
		
		
		ts2.add(te1);
		ts2.add(te2);
		
		System.out.println("Comare by Id" + ts2);
	}

}

class Emp 
{
	int id;
	String name;
	
	public Emp(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void show() 
	{
		System.out.println(id + " " + name);
	}
	
	
	public String toString() {
		
		return id + " " + name;
	}
	
}

class NameCompare implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;
		
		return e1.name.compareTo(e2.name);
	}
}

class IdCompare implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) 
	{
		
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;
		if(e1.id>e2.id)
		{
			return 1;
		}
		else if(e1.id<e2.id)
		{
			return -1;
		}
		else	
		{
			return 0;
		}
		
	}
	

}

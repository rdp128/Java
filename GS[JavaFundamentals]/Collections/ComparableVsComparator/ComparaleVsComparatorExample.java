package ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*  Set(I)
	|
	SortedSet(I)
	|
	TreeSet class
	-It's maintain dictionary order
	-It's object create BST in memory
	-It's doen't have any own logic. It's used either Comparable or Comparator
	
	java.lang.Comparable    		Vs. java.util.Comparator
	-CompareTo() Method		    		-Compare() and equal()
	-Maintain natural single order   	-maintain customized sorting order
				              
 */
public class ComparaleVsComparatorExample {

	public static void main(String[] args) 
	{
		List<Laptop> laptop = new ArrayList<Laptop>();
		laptop.add(new Laptop("Apple", 16, 1200));
		laptop.add(new Laptop("Dell", 12, 800));
		laptop.add(new Laptop("HP",8,600));
		
		//Collections.sort(laptop); //Using Comparable to sort it using by ram only
		Collections.sort(laptop, new BrandComparator()); //Using Comparator to sort by using Brand, Price or ram
		
		for(Laptop l : laptop)
		{
			System.out.println(l);
		}	
	}
}

class Laptop // implements Comparable<Laptop> 
{
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price
				+ "]";
	}
	private String brand;
	private int ram;
	private int price;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	/*@Override
	public int compareTo(Laptop lap) 
	{
		if(this.ram > lap.ram){return 1;}
		else if(this.ram < lap.ram) {return -1;}
		else return 0;
	}*/
	
}

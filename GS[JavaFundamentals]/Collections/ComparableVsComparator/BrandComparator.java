package ComparableVsComparator;

import java.util.Comparator;

public class BrandComparator implements Comparator<Laptop>

{

	@Override
	public int compare(Laptop l1, Laptop l2)
	{
		return l1.getBrand().compareTo(l2.getBrand());
	}

	

}

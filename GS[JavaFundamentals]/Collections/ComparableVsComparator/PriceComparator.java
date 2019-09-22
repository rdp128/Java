package ComparableVsComparator;

import java.util.Comparator;

public class PriceComparator implements Comparator<Laptop>
{
	public int compare(Laptop l1, Laptop l2) 
	{
		if(l1.getPrice()>l2.getPrice())
		{
			return 1;
		}
		else if(l1.getPrice()<l2.getPrice())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}

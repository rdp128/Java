package MarkerInterface;

/* Marker interface is an empty interface i.e. interface with no fields and method.
 * In short, marker interface indicates some signal/command or meaning to JVM or user tool or user library.
 * 
 * Below listed are some of the marker interfaces in Java :
 *  1. Clonnable
 *  2. Serializable
 *  3. Remote
 *  4. ThreadSafe
 *  
 *  Ex. Parking System.
 *   Whoever is implements my parker interface is allow to enter otherwise you have to pay for it.
 *   if you are using my interface you have some permission
 * 
 */
public class MarkerInterfaceExample {

	public static void main(String[] args) 
	{
		TwoWheeler tw = new TwoWheeler();
		FourWheeler fw = new FourWheeler();
		
		if(tw instanceof parking)
		{
			System.out.println("You are allowed to enter");
		}
		else
		{
			System.out.println("You are not allowed to enter");
		}

	}

}

interface parking
{
	
}

class TwoWheeler implements parking
{
	
}

class FourWheeler
{
	
}


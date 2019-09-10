package Collections.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args)
	{
		String st[]={"Rohan","Kishan","Rohan","DRT"};
		HashSet<String> hs = new HashSet<String>();
		//HashSet<String> hs1 = new HashSet<String>(Arrays.asList(st));
		
		for(String s:st)
		{
			hs.add(s);
			//System.out.println(hs.add(s));
			//System.out.println(+hs.hashCode());
		}
		System.out.println(hs);
	}

}


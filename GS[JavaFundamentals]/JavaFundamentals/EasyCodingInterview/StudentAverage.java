package EasyCodingInterview;

import java.util.HashMap;

public class StudentAverage {

	public static void main(String[] args)
	{
		findAvg();
	}
	
	public static void findAvg()
	{
		String ss[][]={{"Bobby", "87" },
					   { "Charles", "100"},
					   { "Bobby", "64" },
					   { "Charles", "22" } };
		
		HashMap<String, Integer> hm1 =new HashMap<String, Integer>();
		HashMap<String, Integer> hm2 =new HashMap<String, Integer>();
		
		for(int i=0; i<ss.length; i++)
		{
			
				if(hm1.containsKey(ss[i][0]))
				{
					hm1.put(ss[i][0],(hm1.get(ss[i][0]) + Integer.parseInt(ss[i][1])));
					hm2.put(ss[i][0],(hm2.get(ss[i][0])+1));
				}
				else
				{
					hm1.put(ss[i][0], Integer.parseInt(ss[i][1]));
					hm2.put(ss[i][0],1);
				}
				
		}
			for(String s: hm1.keySet())
			{
				System.out.println(s + " "+hm1.get(s)/hm2.get(s));
			}
		
	
	}

}

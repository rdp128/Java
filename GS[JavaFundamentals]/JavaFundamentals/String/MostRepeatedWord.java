package String;

import java.util.HashMap;

public class MostRepeatedWord {

	public static void main(String[] args) {
		
		
		String str= "java java test test Test test";
		
		String st[] = str.split(" ");
		
		HashMap<String , Integer> hs = new HashMap<>();
		
		Integer max = Integer.MIN_VALUE;
		String key="";
		
		for (int i = 0; i < st.length; i++)
		{
			
			if(hs.containsKey(st[i]))
			{
				hs.put(st[i], hs.get(st[i])+1);
			}
			else
			{
				hs.put(st[i], 1);
			}
			if(hs.get(st[i]) > max)
			{
				max = hs.get(st[i]);
				key = st[i];
			}
			
			
		}
		System.out.println(key + ":" + max);
		

		
	}
	
}

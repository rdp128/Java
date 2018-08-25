package Array;

import java.util.HashMap;

/*
 * 1)Most repeating charter in String 
 * 	- Convert string to charArray | Create HashMap
 * 2)Most Repeated word in String 
 *  - Create HashMap | Set<Entry<String,Integer>> entrySet = hs.entrySet()
 * 3)Find Duplicate word in string 
 *  - HasMap | Set - keySet()| key > 1 
 * 
 * 
 */
public class Test1 {

	public static void main(String[] args) {
		
		
		String str= "JavaConceptOfTheDay";
		char st[] = str.toCharArray();
		
		HashMap<Character , Integer> hs = new HashMap<>();
		
		Integer max = Integer.MIN_VALUE;
		char key='a';
		
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
			if(hs.get(st[i]) == 1)
			{
				max = hs.get(st[i]);
				key = (char)st[i];
			}
			
			
		}
		System.out.println(key + ":" + max);
		

		
	}
	
}

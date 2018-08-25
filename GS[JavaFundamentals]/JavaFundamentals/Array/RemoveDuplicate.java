package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		//int arr[] = {1,3,1,5,100,5,99,99,48} ;
		String arr[] = { "Rohan","D","p","Rohan","D","Rohan" } ;
		int flag =1 ,count=1;
		
		//method:1
		System.out.println("Using for loop Mathod 1");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i].equals(arr[j]))
				{
					count++;
					System.out.println(arr[i] + "--->" );
					flag = 0;
					count=1;
					
				}
	
			}
			
		}
		if(flag == 1)
		{
			System.out.println("all unique element");
		}
		
		//method:2
		HashSet<String> set = new HashSet<String>();
		
		for (int i = 0; i < arr.length; i++) {
			if(set.add(arr[i]) == false) //if it is unique added. if is already addedd return false
			{
				System.out.println("Using set method " + arr[i]);
			}
			
		}
		
		//method :3
		
		HashMap <String,Integer> hashMap = new HashMap<String,Integer>();
		
		for(String ch : arr)
		{
			if(hashMap.containsKey(ch))
			{
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			else
			{
				hashMap.put(ch, 1);
			}
		}
		
		Set <String> set1 = hashMap.keySet();
		
		for(String keys: set1)
		{
			if(hashMap.get(keys) > 1)
			{
				System.out.println("repeated character is : " + keys + "-->"+ hashMap.get(keys));
			}
		}

	}

}


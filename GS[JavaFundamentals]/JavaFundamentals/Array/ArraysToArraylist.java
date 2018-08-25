package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysToArraylist {

	public static void main(String[] args) {
		
		//Converting array to ArrayList
		String str [] = {"Rohan","patel","Messi","Dhoni","Fifa 2018 WC"};
		
		ArrayList<String> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(str)); // Method 1
		
		//Collections.addAll(list, str); //Method2
		
		System.out.println("Array to ArrayList" + list);
		
		//ArrayList to array
		
		list.add("DRT");
		String array[] = new String[list.size()];
		
		
		list.toArray(array);
		System.out.println("---Arraylist to Array----");
		for (String print : array) {
			System.out.println(print);
		}

	}

}

package Array;

import java.util.HashSet;

public class Union {
	
	public static void main(String[] args) {
		
		int[] a1 = {2, 3, 4, 7, 1};
        
        int[] a2 = {4, 1, 3, 5};
          
        int[] a3 = {8, 4, 6, 2, 1};
          
        int[] a4 = {7, 9, 4, 1};
        
        union(a1,a2,a3,a4);
	}
		
        public static void union(int[]...arrays) {
		
        	HashSet <Integer> hs = new HashSet<>();
           
        	for (int[] allArray: arrays) {
				for (int i : allArray) {
					hs.add(i);
				}
			}
        	System.out.println(hs);
	}

}

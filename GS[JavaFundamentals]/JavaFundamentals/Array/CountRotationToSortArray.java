package Array;


import java.util.*;
import java.lang.*;
import java.io.*;
 
public class CountRotationToSortArray 
{
	
	  
	    public static void main (String[] args) 
	    {
	        //int a[] = {35, 32, 30, 14, 18, 21, 27};
	    	//int a[] = {35, 32, 14, 18, 21, 27};
	        int a[] = {35, 14, 18, 21, 27};
	    	
	    	int k = a.length-1,count=0;
	    	int a1[] = new int [a.length];
	    	
	    	for(int i=0; i<a.length-1; i++)
	    	{
	    		if(a[i] > a[i+1])
	    		{
	    			a1[k] = a[i];
	    			k--;
	    			count++;
	    		}
	    	}
	    	
	    	System.out.println("Roation Count : " + count);
	    	
	    	
	          
	    }
	


}

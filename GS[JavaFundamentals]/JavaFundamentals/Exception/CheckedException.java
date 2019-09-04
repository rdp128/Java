package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) 
	{
	
		BufferedReader br =null;
		
		try
		{
			
			br= new BufferedReader(new FileReader("C:/Users/onepl/Desktop/snoppy.txt")); //throw FileNotFoundException
			
		 }catch(FileNotFoundException e)
		   {
			   System.out.println(e.getMessage());
		   }
		
		StringBuilder sb = new StringBuilder();
		String st = " ";
		
		try
		{
		   st= br.readLine();//throw IOException
		
			while(st!= null)
			{
				sb.append(st);
				System.out.println(st);
				st=br.readLine(); // read next line
			}
			br.close();//throw IOException
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}

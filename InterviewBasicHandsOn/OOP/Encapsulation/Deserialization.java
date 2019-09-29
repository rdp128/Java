package Encapsulation;

import java.io.*;

public class Deserialization {

	public static void main(String[] args) 
	{
		Login l = null;
		
		try 
		{
			FileInputStream fileIn = new FileInputStream("C:\\Users\\onepl\\Documents\\File.txt");
		 
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			l = (Login)in.readObject();

		} 
		catch (FileNotFoundException e) 
		{
		   e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Deserilaze Object");
			
			System.out.println("Username :" + l.getName());
			System.out.println("Password: " + l.getPass());
		}

	}

}

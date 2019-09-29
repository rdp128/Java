package Encapsulation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 
	{
		Login login = new Login();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name: ");
		String n = sc.next();
		login.setName(n);
		
		System.out.println("Enter Password: ");
		String p = sc.next();
		login.setPass(p);
		
		String message = Validation.validate(login);
		boolean b = Validation.validateLength(login);
		
		if(message.equals("Success") && b==true)
		{
			
			try 
		     {
				FileOutputStream file = new FileOutputStream("C:\\Users\\onepl\\Documents\\File.txt");
				
				ObjectOutputStream oos = new ObjectOutputStream(file);
				
				oos.writeObject(login);
			    
				System.out.println("Successfully writtent to File.txt");
			  } 
		     catch (FileNotFoundException e) 
			 {
				e.printStackTrace();
			 }
		     catch (IOException e)
		     {
		    	 e.printStackTrace();
		     }
			
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login unsuccessful and not written to file");
		}
		String name = login.getName();
		String pass = login.getPass();
		
	
	}

}

package Encapsulation;

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
		login.setPass(p);;
		
		String message = Validation.validate(login);
		boolean b = Validation.validateLength(login);
		
		if(message.equals("Success") && b==true)
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login unsuccessful");
		}
		String name = login.getName();
		String pass = login.getPass();
		
	
	}

}

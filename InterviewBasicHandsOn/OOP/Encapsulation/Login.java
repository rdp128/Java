package Encapsulation;

import java.beans.Transient;
import java.io.Serializable;

/* Encapsulation : Wrapping of data member and functions together called encapsulation.
 * JavaBean (POJO : Plain old java object) : This calss provide fully implementation of encapsulation.
 * 
 * What is java bean class:
 * -class should be public
 * -Default public constructor
 * -public setter and getter method
 * -Not extends any other class and must implements serializable interface to achieve persistence. 
 */
public class Login implements Serializable
{
	private String name;
	private transient String pass;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Transient
	public String getPass() {
		return pass;
	}

	@Transient
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}

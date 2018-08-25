

/*
 * Every Java application has 2 context
 * 1.Static context
 * 2.Non Static Context
 * 
 * - If we want to access object from non static context use this  keyword
 * -  If we want to access object from static context use object reference varibale 
 * 
 */

public class ObjectRefrence {

	ObjectRefrence()
	{
		System.out.println("Inside Constructor \n" + this);
	}
	public static void main(String[] args)
	{
		ObjectRefrence obj = new ObjectRefrence();
		System.out.println("Inside Main.. \n" + obj);

	}

}

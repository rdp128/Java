package Encapsulation;
/*
 * We make  Robustness Dog program as it is not tolerating any wrong data
 * 
 * This is how we avoid to set wrong data with private member
 */
public class Dog {

	private int age;
	private String name;

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if( age > 0)
		{
		this.age = age;
		}
		else
		{
			throw new IllegalArgumentException("not valid age : " + age);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setAge(10);
		System.out.println(d.getAge());
		
		d.setName("Tommy");
		System.out.println(d.getName());
	}

}

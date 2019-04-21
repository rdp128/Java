package Inheritance;

//Inheritance with getter and setter method
//Setting dog name and age through getter and setter method
public class InheritanceWithSetterAndGetter {
	public static void main(String[] args) 
	{
		Dog1 d1 = new Dog1();
		
		d1.setAge(10);
		d1.setName("Tommy");
		
		d1.eat();
		d1.bark();
	}
}
	 class Animal1
	{
		private String name;
		 
		public void setName(String name)
		{
			this.name = name;
		}
		
		public String getName(String n)
		{
			return n;
		}
		void eat() {
			System.out.println("Anmianl Eating " + getName(name));
		}
	}
	 class Dog1 extends Animal1
	{
		private int age;
		
		public void setAge(int age)
		{
			this.age = age;
		}
		
		public int getAge(int a)
		{
			return a;
		}
	
		void bark(){
			System.out.println("Dog is barking " + getAge(age));
		}
		
	}


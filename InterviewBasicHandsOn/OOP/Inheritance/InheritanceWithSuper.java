package Inheritance;

//Inheritance with Super keyword
//Setting dog name and age through Constructor
public class InheritanceWithSuper {
	public static void main(String[] args) 
	{
		Dog d = new Dog(10,"Tommy");
		d.eat();
		d.bark();
	}
}
	 class Animal 
	{
		private String name;

		public Animal(String name)
		{
			this.name = name;
		}
		void eat() {
			System.out.println("Anmianl Eating " + name);
		}
	}
	 class Dog extends Animal
	{
		private int age;
		
		public Dog(int age, String name)
		{
			super(name); //calling animal parameterize constructor
			this.age = age;
		}
		void bark(){
			System.out.println("Dog is barking " + age);
		}
		
	}


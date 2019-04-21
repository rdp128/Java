package Inheritance;

public class SingleInheritence {
	public static void main(String[] args) {
		Child c = new Child();
		c.disp();

	}

}

class Parent {
	int x = 10;

	void disp() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	int y = x + 10;

	void disp() {
		System.out.println("Child: " + y);
	}

}

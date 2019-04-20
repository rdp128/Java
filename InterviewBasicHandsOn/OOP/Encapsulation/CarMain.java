package Encapsulation;
/*
 * The fields of a class can be made read-only or write-only.
 * A class can have total control over what is stored in its fields.The users of a class do not know how the class stores its data. 
 * A class can change the data type of a field and users of the class do not need to change any of their code.
 * 
 */
public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.setName("Tesla");
		car.setTopSpeed(120.0d);
		
		System.out.println("KMP :" + car.getTopSpeedKMH());
		System.out.println("MPH :" + car.getTopSpeedMPH());

	}

}

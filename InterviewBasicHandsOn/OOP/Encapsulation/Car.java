package Encapsulation;
/* Reference - https://javatutorial.net/java-encapsulation-example
 *  Following example demonstrates encapsulation in Java. 
 *  The Car class has two fields – name and topSpeed.
 *  Both are declared as private, meaning they can not be accessed directly outside the class. The getter and setter methods : getName, setName, setTopSpeed etc. are declared public. 
 *  Those methods are exposed to “outsiders” and can be used to change and retrieve data from the Car object.
 *  Note, we have one method to set the top speed of the vehicle and two getter methods to retrieve the max speed value either in MPH or KMH. This is what encapsulation does – it hides the implementation and gives us the values we want
 */
public class Car {
	
	private String name;
	private double topSpeed;
	
	public Car() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTopSpeed(double speedMPH) {
		topSpeed = speedMPH;
	}
	
	public double getTopSpeedMPH() {
		return topSpeed;
	}
	
	public double getTopSpeedKMH() {
		return topSpeed * 1.609344;
	}

}

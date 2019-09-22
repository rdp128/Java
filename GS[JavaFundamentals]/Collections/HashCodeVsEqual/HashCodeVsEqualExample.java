package HashCodeVsEqual;

/* if two object are equal than their hashcode is same
 * if two object hashcode is same you can not guarantee that both object are same (Kapil Sharma vs Kapil Dev)
 * 
 * Object class equal()
 *  -if two reference is pointing to same obj. return true
 *  
 *  String class equal()
 *  -content comparision  
 * 
 */
public class HashCodeVsEqualExample {

	public static void main(String[] args)
	{
		Human rohan = new Human(1001, "Rohan");
		Human kishan = new Human(1001, "Rohan");
		
		System.out.println("HashCode of rohan object " + rohan.hashCode());
		System.out.println("HashCode of kishan object " + kishan.hashCode());
		
		String str1 = "FB";
		String str2 = "Ea";
		
		System.out.println(str1.hashCode() + " " + str2.hashCode());

	}

}
class Human
{
	int ssn;
	String Name;
	
	public Human(int ssn, String name) 
	{
		this.ssn = ssn;
		Name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ssn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (ssn != other.ssn)
			return false;
		return true;
	}


}
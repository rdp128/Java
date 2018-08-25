package Instance;

public class CreateStudent {

	public static void main(String[] args) 
	{
		Student s1 = new Student(101,"Rohan");
//		s1.sid= 101;
//		s1.name= "Rohan";
		
		Student s2 = new Student(102,"Kishan");
//		s2.sid= 102;
//		s2.name= "Kishan";
		
		System.out.println(s1.sid +" : " + s1.name) ;
		System.out.println(s2.sid +" : " + s2.name) ;

	}

}

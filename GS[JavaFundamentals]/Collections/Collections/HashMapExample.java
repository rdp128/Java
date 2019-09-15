package Collections;

import java.util.HashMap;

public class HashMapExample
{
	 public static void main(String[] args) {
         Employee emp1 = new Employee("Gaurav","101");
         Employee emp2 = new Employee("Saurav","102");
         Employee emp3 = new Employee("Sachin","1001");
         HashMap<Employee,String> map = new  HashMap();
         map.put(emp1, "IT");
         map.put(emp2, "Accounts");
         map.put(emp3, "Human Resource");
         System.out.println(map);
         System.out.println("Employee 1 Department:"+map.get(emp1));
         System.out.println("Employee 2 Department:"+map.get(emp2));
         System.out.println("Employee 3 Department:"+map.get(emp3));
}

}

class Employee {
	 private String name;
	 private String empId;

	 Employee(String name,String id){
	  this.name = name;
	  this.empId =id;
	 }
	 /**
	  * @return
	  */
	 public String getName() {
	  return name;
	 }

	 /**
	  * @param name
	  */
	 public void setName(String name) {
	  this.name = name;
	 }

	 /**
	  * @return
	  */
	 public String getEmpId() {
	  return empId;
	 }

	 /**
	  * @param empId
	  */
	 public void setEmpId(String empId) {
	  this.empId = empId;
	 }

	@Override
	 public int hashCode() {
	  return 5*empId.length();
	 }

	@Override
	 public boolean equals(Object obj) {
	  if(this == obj)
	   return true;
	  Employee emp = (Employee)obj;
	  if(this.getEmpId().equalsIgnoreCase(emp.getEmpId())){
	   return true;
	  
	  }
	  return false;
	 }
	 }

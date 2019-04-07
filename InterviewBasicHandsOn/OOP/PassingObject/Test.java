package PassingObject;

public class Test {

	public static void main(String[] args) {
		
		Emp emp = new Emp("Rohan", 101);
		EmpService service = new EmpService();
		service.save(emp);

		Emp e = service.getEmp();
		System.out.println(e.getName() + " " + e.getEmpId());
	}

	
}

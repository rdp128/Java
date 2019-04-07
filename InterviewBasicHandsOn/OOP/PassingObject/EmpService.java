package PassingObject;


public class EmpService{
	
	public void save(Emp e)
	{
		System.out.println("--SAVE--" + e.getName() +" " + e.getEmpId());
	}
	
	public Emp getEmp()
	{
		Emp e = new Emp("tom",102);
		return e;
	}
}
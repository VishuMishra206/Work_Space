
public abstract class Employee {

	private String name="vishu";
	private int empid=50023;
	
	public void Employeedetails()
	{
		System.out.println("name of employee : "+ name);
		System.out.println("employee Id : " + empid);
	}
	 public abstract void confidentialEmployee(int s, String p);
	
	 

}

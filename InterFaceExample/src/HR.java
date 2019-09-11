
public class HR extends Employee {

	
	
	private int salary;
	private String performance;

	public void confidentialEmployee(int s, String p) {
		// TODO Auto-generated method stub
		
		this.salary=s;
		this.performance=p;
		System.out.println("salary of employee : "+ s);
		System.out.println("performance of employee :"+ p);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HR obj=new HR();
       obj.confidentialEmployee(5000,"good");
       obj.Employeedetails();
		
	}

}


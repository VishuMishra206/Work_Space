import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class TestStreamEmployee {

	

		public static List<Employee> createEmployee()
		{
			return Arrays.asList(
					new Employee("Priyanka",Gender.Female,30),
					new Employee("Priyank",Gender.Male,32),
					new Employee("vishu",Gender.Female,22),
					new Employee("vinyay",Gender.Male,23),
					new Employee("swati",Gender.Female,21),
					new Employee("neha",Gender.Female,24),
					new Employee("ujjwal",Gender.Male,26),
					new Employee("vaibhav",Gender.Male,28),
					new Employee("dimple",Gender.Female,27));
		}
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<Employee> employee=createEmployee();
		System.out.println("printing list before streams...");
		System.out.println(employee);
		List<String> empname1=new ArrayList<>();
		
		for(Employee emp:employee)
		{
			if(emp.getGender()==Gender.Male)    //if(emp.getAge()<20)
			{
				empname1.add(emp.getName().toUpperCase());
			}
		}
		System.out.println(empname1);
	

List<String> empname2=employee.stream()
.filter(emp -> emp.getAge()<25)
.map(emp -> emp.getName())
.map(emp -> emp.toUpperCase())
.collect(Collectors.toList());
System.out.println("printing name with using stream");
System.out.println(empname2);



employee.stream()
.filter(emp->emp.getGender()==Gender.Male)
.map(emp->new Employee(emp.getName().toUpperCase(),emp.getGender(),emp.getAge()))
.forEach(System.out::println);

	System.out.println("-------");
	System.out.println("printing sum of ages");
	System.out.println(
			employee.stream()
			.mapToInt(Employee::getAge)
			.sum()
			);
	
	System.out.println(
		employee.stream()	
		.min((emp1,emp2)->
		emp1.getAge()>emp2.getAge()?1:-1)
			);
	
	
	
	
	
	
	
	
	
	}
	
}











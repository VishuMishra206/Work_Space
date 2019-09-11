
public class Employee {
 
	private final String name;
	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	private final Gender gender;
	private final int age;
	
Employee(String name , Gender gender, int age)
{
	this.name=name;
	this.gender=gender;
	this.age=age;
	
}

public String toString()
 {
	return String.format("%s--%s--%d", name,gender,age);
 }


}




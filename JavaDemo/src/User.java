import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// import java.util.*;
import java.util.Scanner;

 public class User {
	 
	 private String name;
		private int age;
		public User(String name, int age)
		{
		 this.name=name;
		 this.age=age;
		 
		}
		public String getName()
		{
		return name;	
		}
		public void setName(String name)
		{
		 this.name=name;	
		}
		public int getAge()
		{
			return age;
			
		}
		public void setAge(int age)
		{
			this.age=age;
		}

	 public static void main(String[] args)
		{
			List<User> users=new ArrayList<>();
			Scanner sc=new Scanner(System.in);
		    ArrayList<User> a1=new ArrayList<>();
		    for(int i=0;i<3;i++)
		    	a1.add(new User(sc.next(),sc.nextInt()));
		    a1.forEach(a -> {
		    	System.out.print("Name:"+ a.getName());
		    	for(int i=0;i<10-a.getName().length();i++)
		    		System.out.print(" ");
		    	System.out.println(", Age:"+a.getAge());
		    });
			
		    //users.add(new User("Rajeev",25));
			//users.add(new User("John",34));
			//users.add(new User("steve",29));
			//users.forEach(user-> {System.out.println("Name:"+user.getName()+"Age:"+ user.getAge());
			//});
		}

 }
 



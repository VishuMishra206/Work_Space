//import java.util.Scanner;
//public class Array1 {
	
	

	//public static void main(String[] args) {
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the studentsID");
		

	//}

//}
import java.util.Scanner;

public class Array1 {

public static void main(String[] args) 
{
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter 5 names: ");
    String n = scan.nextLine();


    String [] names = {n};
                                 //store the names in an array
    for (int i = 0; i < 5; i++)
    {
        names[i] = scan.nextLine();
    }
    //sequentially print the names and upperCase them
    for (String i : names)
    {
        System.out.println(i);
        }

    scan.close();

}

}

import java.util.Scanner;


public class OperationAirth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the value of a and b.....");
   int a=sc.nextInt();
   int b=sc.nextInt();
   int add = a+b;
   int sub = a-b;
   int mul = a*b;
   float divide = (float)a/b;
   
   
   System.out.println("Addition : "+ add);
   System.out.println("Subtraction : "+ sub);
   System.out.println("multipication : "+ mul);
   System.out.println("divide : "+ divide);
	}

}

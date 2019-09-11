import java.util.Scanner;

public class Factorial {

	static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		
		return (n*factorial(n-1));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Scanner sc=new Scanner(System.in);
    //System.out.println("Enter the no..");
    //int a=sc.nextInt();
    //int fact=1;
    //for(int i=1;i<=a;i++)
    //{
    	//fact=fact*i;
    //}
    //System.out.println("factorial is :"+ fact);
   int i, fact;
   int no=5;
   fact=factorial(no);
   System.out.println("factorial is :" + " " + fact);
	
	
	
	
	}

}

import java.util.Scanner;


public class Revese_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String to be reversed...");
	     //Scanner sc=new Scanner(System.in);
	     //int a=sc.nextInt();
	    int a=12588643; 
		int reverse=0;
	     
	     while(a!=0)
	     {
	    	 reverse=reverse*10;
	    	 reverse=reverse+a%10;
	    	 a=a/10;
	    	 
	     }
	     System.out.println("reverse of no. : " + reverse  );
		
	}

}

import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int sum=0,r;
   int temp=n;
   
   while(n>0)
   {
	 r = n%10;
	 sum= (sum*10)+r;
	 n=n/10;
	 
   }
   if(temp==sum)
   System.out.println("palindrome is :  " + sum );
   else
   {
	   System.out.println("not a palindrome");
   }
	}

}

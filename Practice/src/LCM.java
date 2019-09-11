import java.util.Scanner;


public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter the two no ...");
    Scanner sc=new Scanner(System.in);
    long a=sc.nextInt();
    long b=sc.nextInt();
   long lcm=lcm(a,b);
    
    System.out.println("lcm :"+lcm);
	}
	
 static long lcm(long n1,long n2)
 {
	 long temp,res,i=2;
	 if(n1 > n2)
		 res=n1;
	 else 
		 res=n2;
	 temp=res;
	 while(res%n1!=0||res%n2!=0)
	 {
		 res=temp*i;
		 i++;
	 }
	return res;
	 
	 
	
	 
 }

}

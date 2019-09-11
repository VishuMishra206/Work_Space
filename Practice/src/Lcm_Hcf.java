import java.util.Scanner;


public class Lcm_Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the two no...");
    int x=sc.nextInt();
    int y=sc.nextInt();
    
    int a=x;
    int b=y;
    
    while(b!=0)
    {
    	int t=b;
    	b=a%b;
    	a=t;
    }
    int hcf=a;
    int lcm=(x*y)/hcf;
    
    System.out.println("HCF is :"+ hcf);
    System.out.println("LCM is :"+lcm);
	}
	

}

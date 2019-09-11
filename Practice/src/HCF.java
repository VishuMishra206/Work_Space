import java.util.Scanner;


public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter the number for HCF...");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int hcf=0;
    
    for(int i=1; i<=a||i<=b;i++)
    {
    	if(a%i==0 && b%i==0)
    	
    		hcf=i;
    	
    	
    }
    System.out.println("HCF is :"+ hcf);
    
	}

}

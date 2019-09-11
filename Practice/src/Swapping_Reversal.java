import java.util.Scanner;


public class Swapping_Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter the two no.");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("before swapping :\n"+ a +"\n" + b);
    
    //int temp;
    //temp=a;
    //a=b;
    //b=temp;

    // Using without third variable.....
    
    a=a+b;
    b=a-b;
    a=a-b;
    
    
    
    
    System.out.println("after swapping :\n"+ a + " \n"  + b);
    
	}

}

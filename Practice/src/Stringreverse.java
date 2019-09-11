import java.util.Scanner;


public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the String to be reversed...");
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     String reverse="";
     for(int i=str.length()-1;i>=0;i-- )
     {
    	 reverse=reverse+str.charAt(i);
    	 
     }
     System.out.println("Reverse string is :"+ reverse);
	}

}

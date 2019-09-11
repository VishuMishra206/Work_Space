

import java.util.Scanner;

public class SquareRoot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.:");
        double number = sc.nextDouble();
        double t; 	
        double squareRoot = number/2;
        do {
            t = squareRoot;
            squareRoot = (t+(number/t))/ 2;	  
           }while ((t - squareRoot) != 0);
        sc.close();
        	System.out.println("Square Root" + " of " + number + " is " + squareRoot);
    }
}

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double num=29;
    boolean flag=false;
    for(double i=2;i<num/2;i++)
    {
    	if(num%i==0)
    	{
    		flag=true;
    		break;
    	}
    	
    }
    if(!flag)
    	//double double squareRoot = Math.sqrt(num);
    	System.out.println("no is prime..." + num);
        
    else
    	System.out.println("no is not prime..." + num);
    
	}

}

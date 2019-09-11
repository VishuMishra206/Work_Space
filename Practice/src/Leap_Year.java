
public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int year = 2012;           //1900;
    boolean leap = false;
    if(year%4==0)
    {
    	if(year%100==0)
    	{
    		if(year%400==0)
    			leap=true;
    		
    		else
    			leap=false;
    		}
    	else
    		leap=true;
    }else
    	leap=false;
    
    if(leap)
    System.out.println("leap year is : "+ year);
    else
    	System.out.println("not a leap year : "+ year);
    }
	
}

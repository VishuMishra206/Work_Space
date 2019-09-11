package Exception;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}





public class testcustom {

	static void validate(int age)throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("you can vote" );
	}
	
	public static void main(String args[])
	{
		try {
			validate(20);
		}
		catch(Exception e)
		{
		 System.out.println("exception occured :"+e);	
		}
		System.out.println("welcome to customException....");
	}
}

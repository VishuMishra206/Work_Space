
public class ExamException {

	static void average()
	{
		try
		{   int a=10;
		    int b=0;
		    int c=a/b;
		    System.out.println("divide-- " + c);
			throw new Exception("");
		}
		catch(Exception x)
		{
			System.out.println("exception at here...");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      average();
      
	}

}

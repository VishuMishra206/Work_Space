
public class ThrowsExam {

	static void average() throws ArithmeticException
	{   //int n=5;
	
		//if(n==10)
		//{
			//System.out.println("no is equal...");
		//}
		//else
			//System.out.println("no is not equal....");
		//System.out.println("print throws...");
		//throw new ArithmeticException("hey...");
		
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("ans will be :"+ c);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	try
	{
		average();
		
	}
	catch(ArithmeticException e)
	{
		System.out.println("catch" + e);
		
	}
	finally
	{
		System.out.println("hellooo....");
	}
	}

}


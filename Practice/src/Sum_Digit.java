
public class Sum_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=54321;
       System.out.println(getsum(n));
	}
	
	static int getsum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
		
	}

}

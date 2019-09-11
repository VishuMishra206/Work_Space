
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=370, n,temp,total=0;
    n=a;
    while(n!=0)
    {
    	temp=n%10;
    	total=total + temp*temp*temp;
    	n=n/10;
    	
    	
    }
    if(total==a)
    	System.out.println("armstrong no is : "+ a);
    else
    	System.out.println("not a armstrong is : "+ a);
	}

}


public class Greatest_among {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {2,1,4,5,3,8,6,9,10,7,25};
    int max=arr[0];
    for(int i=0;i<arr.length;i++)
    {
    	if(max<arr[i])
        max=arr[i];
    }
    System.out.println("greatest no among 10 is : " + max );
	}

}

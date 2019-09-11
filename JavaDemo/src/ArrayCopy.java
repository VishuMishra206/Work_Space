
public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] source= {00,33,11,55,6,17};
		int[] destination=new int[6];
		//System.arraycopy(source,1,destination,0,4);
		for(int i=0;i<=5;i++)
		{
			System.out.println(destination[i]+"\t");
		}
		System.arraycopy(source, 0, destination, 0, 6);
		for(int i=0;i<=5;i++)
		{
			System.out.println(destination[i]+"\t");
		}

	}

}

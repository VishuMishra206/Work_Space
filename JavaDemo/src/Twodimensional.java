
public class Twodimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //  int x[][]=new int[3][3];
    
    String y[][]=new String[][] {{"A","B","C"},{"D","E","F"},{"G","H","I"}};
		
		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				System.out.print(y[i][j]+"\t");
				
			}
			System.out.println();
		}
	}

}

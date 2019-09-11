import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //String city[][]=null;
         System.out.println("Please enter the number of rows and columns");
         Scanner sc=new Scanner(System.in);
         int r=sc.nextInt();
         int c=sc.nextInt();
         
         String city[][]=new String[r][c];
         for(int i=0;i<r;i++)
         {
        	 for(int j=0;j<c;j++)
        	 {
        		city[i][j]=sc.next(); 
        	 }
         }
         for(int i=0;i<r;i++)
         {
        	 for(int j=0;j<c;j++)
        	 {
        		System.out.print(city[i][j]+"\t"+"\t");
        	 }
        	 System.out.println();
         }
		
		
	}

}

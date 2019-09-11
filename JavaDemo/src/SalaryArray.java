import java.util.Scanner;

public class SalaryArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("Please enter the number of rows and columns");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        
        double salary[][]=new double[r][c];
        for(int i=0;i<r;i++)
        {
       	 for(int j=0;j<c;j++)
       	 {
       		salary[i][j]=sc.nextDouble(); 
       	 }
        }
        for(int i=0;i<r;i++)
        {
       	 for(int j=0;j<c;j++)
       	 {
       		System.out.print(salary[i][j]+"\t"+"\t");
       	 }
       	 System.out.println();
        }
		
		
	}

	}



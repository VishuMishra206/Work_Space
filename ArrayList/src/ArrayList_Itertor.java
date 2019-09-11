import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList_Itertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     ArrayList l1=new ArrayList<>();
     for(int i=1;i<5;i++)
     {
    	 l1.add(sc.nextInt());
     }
     Iterator itr=l1.iterator();
     while(itr.hasNext())
     {
    	 System.out.println(itr.next());
     }
     
     
	}

}






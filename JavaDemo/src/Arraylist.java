import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


public class Arraylist {

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

	private Iterator Iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}

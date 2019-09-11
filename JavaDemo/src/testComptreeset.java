import java.util.*;

public class testComptreeset implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Integer i1=(Integer)arg0;
	       Integer i2=(Integer)arg1;
	       if(i1<i2)
	    	   return +1;
	       else if(i1>i2)
	    	   return -1;
	       else
	    	   return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet<Integer> t1=new TreeSet<Integer>(new testComptreeset());
      t1.add(3);
      t1.add(4);
      t1.add(1);
      t1.add(2);
      System.out.println(t1);
      
	}
	//@Override
	//public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		//return 0;
	//}

}

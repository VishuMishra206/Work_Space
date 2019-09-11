

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       myData date1=new myData(2,3,2011);
       myData date2=new myData(2,3,2011);
       if(date1==date2)
       {
    	   System.out.println("date1 is identical date2");
    	  
       }
       
       
       if(date1.equals(date2))
       {
    	   System.out.println("date1 is equal to date2");
       }
       else
       {
    	   System.out.println("date1 is not identical date2");
       }
       System.out.println(date1.hashCode());
       System.out.println(date2.hashcode());
	}
	

}

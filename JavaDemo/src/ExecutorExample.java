import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("this is inside :"+Thread.currentThread().getName());
           System.out.println("executor service is getting created");
           //System.out.println();
           ExecutorService exservice=Executors.newSingleThreadExecutor();
           System.out.println("creating a runnable");
           Runnable runn=new Runnable()
        		   {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						Thread.currentThread().setName("My Thread...");
						System.out.println("this is inside runnable:"+ Thread.currentThread().getName()); //service
					}
        	   
        		   };
        		   System.out.println("now we are submitting the runnable object..");
        		   exservice.submit(runn);   //we launching  the new services
        		   exservice.shutdown();      // for shutdowing
                   System.out.println("this is after shutdown:"+Thread.currentThread().getName());
	}

}

package volatileTest;

public class Data {
   public volatile int counter=0;
   public int getCounter()
   {
	return counter;
	   
   }
	public void countIncrement()
	{
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		++counter;
		
	}
	
	
}
class mytask implements Runnable
{
	private Data data;
	public mytask(Data data)
	{
		this.data=data;
	}
  public void run()
  {
	  //System.out.println("Value for Thread"+Thread.currentThread().getName()+"before Increment"+data.getCounter());
	  data.countIncrement();
	  System.out.println("Value for Thread"+Thread.currentThread().getName()+"after Increment"+data.getCounter());
	  
  }
}

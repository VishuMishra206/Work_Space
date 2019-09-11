
public class ThreadExam implements Thread
{

	public void run()
	{
		int ctr=0;
		for(int i=1;i<=10;i++)
		System.out.println(ctr++);
		
	
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("java thread");
		System.out.println(Thread.currentThread().getPriority());
	    Thread.currentThread().setPriority(7);
	    System.out.println(Thread.currentThread());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ThreadExam tr=new ThreadExam();
       Thread t1=new Thread();
       t1.start();
       t1.setName("Hey Thread...");
       System.out.println(Thread.currentThread());
       System.out.println(Thread.currentThread().getName());
       Thread.currentThread().setName("Main Thread");
       System.out.println(Thread.currentThread().getPriority());
       Thread.currentThread().setPriority(5);
       System.out.println(Thread.currentThread());
	}

}


public class MyThread extends Thread {
	
	public void run()
	{
		int ctr=0;
		for(int i=1;i<=10;i++)
		System.out.println(ctr++);
		try {
			Thread.sleep(9000);
		}
		catch(InterruptedException e)
		{
		e.printStackTrace();
	}
		System.out.println(Thread.currentThread());
		System.out.println("inside child thread..."+ Thread.currentThread().getName());
		Thread.currentThread().setName("java thread");
		System.out.println(Thread.currentThread().getPriority());
	    Thread.currentThread().setPriority(7);
	    System.out.println(Thread.currentThread());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread mt1=new MyThread();
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt1);
		t1.setName("Thread1");
		t1.start();
		t1.setName("Thread2");
		t2.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(4);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());
		//mt1.start();
		
		
	}

}

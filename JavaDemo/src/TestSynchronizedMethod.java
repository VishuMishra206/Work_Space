
public class TestSynchronizedMethod {
	
	class a1{
		
		public  void methoda1()
		{
			System.out.println("inside methoda1 of inner class...");
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestSynchronizedMethod t1=new TestSynchronizedMethod();
		TestSynchronizedMethod.a1 t2=new TestSynchronizedMethod().new a1();
		t2.methoda1();
		
	}

}


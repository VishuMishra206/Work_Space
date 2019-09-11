

public class vehicle implements Engine {
	
	int speed;
	
	
	public void speed(int a) {
		// TODO Auto-generated method stub
		
		this.speed=a;
		System.out.println("speed is:"+ a);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		vehicle obj=new vehicle();
		obj.speed(70);
		
		
	}


	
	
}

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LocalDate today=LocalDate.now();
       System.out.println(today);
       
       LocalTime timeobj=LocalTime.now();
       System.out.println(timeobj);
	   LocalDateTime  dttime = LocalDateTime.now();
	   
	}
	
	

}

import java.util.HashMap;
import java.util.Map;

public class CreateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<String,Integer>numberMapping=new HashMap<>();
      
      numberMapping.put("One", 1);
      numberMapping.put("Two", 2);
      numberMapping.put("Three", 3);
      numberMapping.put("a",null);
      numberMapping.put("b", null);
      numberMapping.put("b", null);
     
      
      numberMapping.putIfAbsent("Four", 4);
      System.out.println(numberMapping);
		
		
		
	}

}

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String, Integer>priceMap=new HashMap<>();
     //priceMap.put("TV", 467364);
     //priceMap.put("Phone", 34378);
     //priceMap.put("Car", 674712);
     //priceMap.put("Bike", 1234);
     //priceMap.put("Furniture", 36368);
     Scanner sc=new Scanner(System.in);
     for(int i=0; i<3;i++)
     {
    	 System.out.println("ENTER THE ITEMS");
    	 String a=sc.next();
    	 System.out.println("ENTER THE PRICE");
    	 Integer b=sc.nextInt();
    	priceMap.put(a,b);
     }
     
     System.out.println("price map:"+priceMap);
     
     Set<String>keys=priceMap.keySet();
     Collection<Integer>values=priceMap.values();
     Set<Entry<String, Integer>>entries=priceMap.entrySet();
     System.out.println("Keys of Map:"+ keys);
     System.out.println("values from Map:"+values);
     System.out.println("enties from Map:"+entries);
	}

}

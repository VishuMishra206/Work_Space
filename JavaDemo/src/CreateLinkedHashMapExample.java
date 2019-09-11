import java.util.LinkedHashMap;
import java.util.Scanner;

public class CreateLinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedHashMap<String,Integer>wordNumberMapping=new LinkedHashMap<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
        	System.out.println("Enter the Keys :");
        	String a=sc.next();
        	System.out.println("Enter the values :");
        	Integer b=sc.nextInt();
        	wordNumberMapping.put(a,b);
        }
        //wordNumberMapping.put("one", 1);
        //wordNumberMapping.put("two", 2);
        //wordNumberMapping.put("three",3);
        //wordNumberMapping.put("four",4);
        //wordNumberMapping.put("five",5);
        
        System.out.println(wordNumberMapping);
	}

}


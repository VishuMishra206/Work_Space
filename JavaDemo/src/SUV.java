import java.util.Arrays;
import java.util.List;


public class SUV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list1=Arrays.asList(45,0,2,3);
     printSuperClass(list1);
     List<Number> list2=Arrays.asList(1.3,5,6,7);
     printSuperClass(list2);
     
	}
	public static void printSuperClass(List<? super Integer>list)
	{
		System.out.println(list);
	}

}




















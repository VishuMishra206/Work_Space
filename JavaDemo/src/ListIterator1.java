import java.util.*;

public class ListIterator1 {
 public static void main(String[] args)
 {
	 List<Integer> li=new ArrayList();
	 ListIterator<Integer> litr=null;
	 li.add(23);
	 li.add(45);
	 li.add(12);
	 li.add(8);
	 litr=li.listIterator();
	 System.out.println("elements in forward direction");
	 while(litr.hasNext())
	 {
		 System.out.println(litr.next());
	 }
	 System.out.println("elements in backward direction");
	 while(litr.hasPrevious()) {
		 System.out.println(litr.previous());
	 }
 }
}

import java.util.*;

public class ArrayListTest {

	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList();
		list.add("Reena");
		list.add("Viraj");
		list.add("Reena");
		list.add("Vishu");
		System.out.println(list.size());
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}


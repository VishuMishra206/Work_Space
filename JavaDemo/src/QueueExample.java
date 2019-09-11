import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // Queue<String>waitingQueue=new LinkedList<>();
      //waitingQueue.add("rajiv");
     // waitingQueue.add("Chris");
     // waitingQueue.add("John");
     // waitingQueue.add("Mark");
     // waitingQueue.add("Steven");
     // System.out.println("waitingQueue:"+waitingQueue);
     //String name=waitingQueue.remove();
      //System.out.println("remove from waitingQueue:"+name+"|New WaitingQueue:"+ waitingQueue);
     // name=waitingQueue.remove();
     // System.out.println("Removed from waitingQueue:"+name+"| New waitingQueue:"+waitingQueue);
      
		LinkedList<String> friends=new LinkedList<>();
		friends.add("Rajiv");
		friends.add("John");
		friends.add("David");
		friends.add("Chris");
		System.out.println("initial linkedlist:"+ friends);
		friends.remove(1);
		System.out.println("after add(3.\"lisa\"):" +friends);
		friends.remove(2);
		System.out.println("after addfirst(\"steve\"):"+friends);
		friends.addLast("jennifer");
		System.out.println("after addlast(\"jennifer\")"+friends);
		
		List<String>familyFriends=new ArrayList<>();
		familyFriends.add("Jesse");
		familyFriends.add("wait");
		friends.addAll(familyFriends);
		System.out.println("after addAll(familyFriends):"+friends);
	}

}

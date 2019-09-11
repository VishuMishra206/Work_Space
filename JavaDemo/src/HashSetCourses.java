import java.util.HashSet;
import java.util.Set;

public class HashSetCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Set<Courses> cours=new HashSet<>();
    cours.add(new Courses("vishu",101,2));
    cours.add(new Courses("akul",102,1));
    cours.add(new Courses("nikku",103,3));
    System.out.println(cours);
	}

}

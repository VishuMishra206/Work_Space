import java.util.*;


public class Courses {

	private String name;
	private int id;
	private int duration;
	
	public Courses(String name, int id, int duration)
	{
		this.name=name;
		this.id=id;
		this.duration=duration;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	 public boolean equals(Object o)
	 {
		if(this==o) return true;
		if(o==null||getClass()!=o.getClass())
			return false;
		Courses cours=(Courses) o;
		return id==cours.id;
	 }
	
	 public int hascode()
	 {
		 return Objects.hash(id);
	 }
	 
	 public String toString()
	 {
		 return "Courses{"+"name="+name+", id="+id+" , duration="+duration+"}";
	 }
}


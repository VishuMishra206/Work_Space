import java.util.*;

import java.lang.*;
import java.io.*;



 class Vishu {

	int rollno;
	String name,address;
	
	public Vishu(int rollno, String name, String address)
	{
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
	
	public String toString()
	{
		 return this.rollno + " " + this.name + " " + this.address; 
	}
}

class Sortbyroll implements Comparator<Vishu>
{
	public int compare(Vishu a, Vishu b)
	{
		return a.rollno-b.rollno;
	}
}

class Sortbyname implements Comparator<Vishu>
{
    public int compare(Vishu a, Vishu b )
    {
    	return a.name.compareTo(b.name);
    }
}



class VishuComparator
{ 
    public static void main (String[] args) 
    { 
        ArrayList<Vishu> ar = new ArrayList<Vishu>(); 
        ar.add(new Vishu(111, "bbbb", "london")); 
        ar.add(new Vishu(131, "bbbb", "nyc")); 
        ar.add(new Vishu(121, "cccc", "jaipur")); 
        
        System.out.println("unsorting...");
        for(int i=0;i<ar.size();i++)
        {
        	System.out.println(ar.get(i));
        }
        Collections.sort(ar, new Sortbyroll()); 
       
        System.out.println("sorting ny rollno....");
         for (int i=0; i<ar.size(); i++) 
         {
            System.out.println(ar.get(i)); 
         }
        Collections.sort(ar, new Sortbyname());
        System.out.println("\nSorted by name"); 
        for (int i=0; i<ar.size(); i++) 
        {
            System.out.println(ar.get(i)); 
        }
        
    }
}
  
package Serialization;


		// TODO Auto-generated method stub
  //Book book1=new Book(1201,"the completer reference","herber shield",600);
/*  try {
	  FileOutputStream fos=new FileOutputStream("Book.ser");
	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	  oos.writeObject(book1);
	  System.out.println("Book  is successfully serialized");
	  FileInputStream fis=new FileInputStream("Book.ser");
	  ObjectInputStream ois=new ObjectInputStream(fis);
	  
	  Book mybook=(Book)ois.readObject();
	  System.out.println("Book is successfully retrived from serialized object");
	  System.out.println("after serialization:"+mybook);
  }
  catch(FileNotFoundException e)
  {
	  e.printStackTrace();
  }*/
  
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestSerialize {
private String filename="Book.ser";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

//book b2=new book();
//Scanner sc=new  Scanner(System.in);
//String auth=sc.next();
//b2.setAuthor(auth);
//b2.setBookid(1111);
//b2.setTitle("C++");
Book b2=new Book(100, "java", "Anand", 400);
try {
	//serialize the object
	System.out.println("Before serialization"+ b2);
	FileOutputStream fos=new FileOutputStream("Book.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(b2);
	System.out.println("Book is successfully serialized..");
	
	//deserialize the book object
	FileInputStream fis=new FileInputStream("Book.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	
	Book b3=(Book) ois.readObject();
	System.out.println("Book is successfully retrieved from serialized object");
	System.out.println("After serialization .."+ b3);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}

}




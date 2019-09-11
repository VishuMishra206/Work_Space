import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		// TODO Auto-generated method stub
  Book book1=new Book(1201,"the completer reference","herber shield",600);
  try {
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
  }
	}

}

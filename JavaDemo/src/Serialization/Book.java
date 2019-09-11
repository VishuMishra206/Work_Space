package Serialization;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.IOException;


public class Book implements Externalizable {
	private int bookid;
	private  String title;
	private String author;
	private  double price=500.50;
	
	public Book(int bookid, String title, String author, double price)
	{
		this.bookid=bookid;
		this.title=title;
		this.author=author;
		this.price=price;
		
	}
	public Book()
	{
		
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
public String toString()
{
	return "Book{" + "book id"+bookid +"title"+title+"author"+author+"price"+price+")";
	}

public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
{
 this.author=in.readLine();
 this.title=in.readLine();
}
public void writeExternal(ObjectOutput out) throws IOException
{
	out.write(bookid);
	out.writeObject(title);
	out.writeChars(author);
    out.writeObject(price);
	
	}

}



















package Exception;
import java.nio.file.attribute.FileTime;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class WriteFileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String str;
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);
			System.out.println("Enter some string...");
			
			//FileOutputStream f1=new FileOutputStream("d://put.txt");
			//f1.write(65);
			//f1.write(66);
			//f1.write(67);
			//f1.write(45);
			//f1.close();
			//System.out.println("file is closing...");
    /* FileWriter filewriter=new FileWriter("temp.txt");
     BufferedWriter bufferedWriter=new BufferedWriter(filewriter);
     bufferedWriter.write("hello");
     bufferedWriter.write("here is some");
     bufferedWriter.newLine();
     bufferedWriter.write("we are writing");
     bufferedWriter.write("some text to the files");
     bufferedWriter.close();
     
     FileReader fr=new FileReader("temp.txt");
     BufferedReader br=new BufferedReader(fr);
     int i;
     while((i=br.read())!=-1)
     {
    	 System.out.println((char)i);
     }*/
     try {
    	 str=br.readLine();
    	 str=null;
    	 
	}
	catch(IOException ex)
	{
		System.out.println();
	}

}
}


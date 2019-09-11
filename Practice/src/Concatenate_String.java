
public class Concatenate_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String firstname="vishu";
     String lastname="mishra";
     String name=firstname +" "+lastname;
     System.out.println(name);
     
     
     
     //2nd way using stringbuilder...
     StringBuilder sb=new StringBuilder(14);
     sb.append(firstname).append(" ").append(lastname);
     System.out.println(sb.toString());
     
     //3rd way using stringbuffer
     StringBuffer sbuf=new StringBuffer(14);
     sbuf.append(firstname).append(" ").append(lastname);
     System.out.println(sbuf.toString());
	}

}

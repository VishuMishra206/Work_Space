import java.util.Scanner;

public class EnumTest {

	public enum Rainbowcolor{
		red,orange,yellow,green,violet,indigo,blue;
		
	}
	Rainbowcolor rcolor;
	
	public EnumTest(Rainbowcolor rcolor)
	{
		this.rcolor=rcolor;
	}
	
	public void  getRainbowColor()
	{
		switch(rcolor)
		{
		case red: System.out.println("color is red");
		          break;
		case orange:System.out.println("color is orange");
		          break;
		case yellow:System.out.println("color is yellow");
		          break;
		case green:System.out.println("color is green");
		          break;
		case violet:System.out.println("color is violet");
		          break;
		case indigo:System.out.println("color is indigo");
		          break;
		case blue:System.out.println("color is blue");
		          break;
		default:System.out.println("Invalid color/////");          
		          break;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="blue";
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter your choice : ");
		//String choice=sc.nextLine();
        
        
        EnumTest t1=new EnumTest(Rainbowcolor.valueOf(str));
        t1.getRainbowColor();
       // EnumTest et=new EnumTest(Rainbowcolor.blue);
        //System.out.println(et.rcolor);
       // et.getRainbowColor();
	}

}

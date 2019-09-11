
public class myData 
{
  private int day;
  private int month;
  private int year;
  
  public myData(int d, int m, int y)
  {
	  this.day=d;
	  this.month=m;
	  this.year=y;
  }

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	//return super.equals(obj);
	boolean result=false;
	if((obj!=null)&&(obj instanceof myData))
    {
		myData d=(myData)obj;
		if((day==d.day)&& (month==d.month)&&(year==d.year))
		{
			result=true;
		}
	}
	return result;
}
public int hashcode()
{
	System.out.println("hey.............");
	return (day^month^year);
	}
  
  
}

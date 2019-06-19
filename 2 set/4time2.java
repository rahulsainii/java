import java.util.*;
class timetwo
{
	public static void main(String[] args)
	{
	Scanner obj=new Scanner(System.in);
	int minutes,hours;
	System.out.println("enter total minutes :");
	minutes=obj.nextInt();
	hours=minutes/60;
	minutes=minutes%60;
	System.out.println("Total time is: "+hours+":"+minutes);
	}
}	
	
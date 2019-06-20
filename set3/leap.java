import java.util.*;
class Leap
{
	static public void main(String[] args)
	{
	  Scanner obj=new Scanner(System.in);
	  int year;
	  System.out.println("ENTER any year :");
	  year=obj.nextInt();
	  if(year%4==0)
	  System.out.println("it is a leap year");
	  else
	  System.out.println("it is not a leap year");
	}  
}
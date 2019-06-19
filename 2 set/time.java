import java.util.*;
class time
{
	public static void main(String[] args)
	{
    Scanner obj=new Scanner(System.in);
	int minutes,hour;
	System.out.println("Enter hours ");
	hour=obj.nextInt();
	System.out.println("Now Enter minutes ");
	minutes=obj.nextInt();
	minutes=(hour*60)+minutes;
    System.out.println("Total minutes are :"+minutes);
	}
}
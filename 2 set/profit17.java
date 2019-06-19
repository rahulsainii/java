import java.util.*;
class profit
{
   public static void main(String[] args)
     {
		 Scanner obj=new Scanner(System.in);
	
	   double sp,sp1,profit,profit1,cp;
	   System.out.println("enter total selling price of 15 items");
	   sp=obj.nextDouble();
	   sp1=sp/15;
	   System.out.println("enter total profit of 15 items");
	   profit=obj.nextDouble();
	   profit1=profit/15;
	   cp=sp1-profit1;
	    System.out.println("cost price of an item is : "+cp);
	   
	 
	 }


}
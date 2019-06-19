import java.util.*;
class salary
{
  public static void main(String[] args)
  {
      Scanner obj=new Scanner(System.in);
      int basic,da,hrent,gs;
	  System.out.println("Enter basic salary of Ramesh :");
      basic=obj.nextInt();
      da=(40*basic)/100; 
      hrent=(20*basic)/100;
	  gs=(basic)+(da)+(hrent);
	  System.out.println("Gross salary of ramesh is :"+gs);
	  
  
  }


}
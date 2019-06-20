import java.util.*;
class triangle
{
	static public void main(String[] args)
	{
	  Scanner obj=new Scanner(System.in);
	  int n1,n2,n3;
	  System.out.println("ENTER THE SIDES OF TRIANGLE");
	  n1=obj.nextInt();
	  n2=obj.nextInt();
	  n3=obj.nextInt();
	  if((n1+n2+n3)==180)
	    System.out.println("Triangle is valid");
	  else
	     System.out.println("Triangle is not valid");
	}	
}   	  
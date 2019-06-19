import java.util.*;
class length
{
    public static void main(String[] args)
    {
	  Scanner obj=new Scanner(System.in);
	  double km,m,in,feet,cm;
	  System.out.println("enter distance in km :");
	  km=obj.nextFloat();
	  m=1000*km;
	  cm=100*m;
	  feet=0.3048*m;
	  in=0.0254*m;
	  System.out.println("it has "+m+"meter.");
	  System.out.println("it has "+in+"inches.");
	  System.out.println("it has "+cm+"centimeter.");
	  System.out.println("it has "+feet+"feet.");
	  
	
	
	
	}



} 
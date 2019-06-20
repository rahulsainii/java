import java.util.*;
class area
{ 
   public static void main(String[] args)
   {
     Scanner obj=new Scanner(System.in);
     int l,b,ar,p;
     System.out.println("enter length and breadth of rectangle :");
  
     l=obj.nextInt();
     b=obj.nextInt();
     ar=l*b;
     p=2*(l+b);
	 if(ar>p)
	    System.out.println("AREA IS GREATER THAN PERIMETER");
	 else
       System.out.println("PERIMETER IS GREATER THAN AREA");
    }
}	   
	  
import java.util.*;
class circle
{ 
   public static void main(String[] args)
   {
     Scanner obj=new Scanner(System.in);
	 double x1,y1,x2,y2,r,d;
	 System.out.println("ENTER THE CO-ORDINATES OF CIRCLE'S CENTER :");
	 x1=obj.nextFloat();
	 y1=obj.nextFloat();
	 System.out.println("ENTER THE radius of circle :");
	 r=obj.nextFloat();
	 System.out.println("ENTER THE CO-ORDINATES TO SEARCH :");
	 x2=obj.nextFloat();
	 y2=obj.nextFloat();
	 d=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	 if(d<r)
	   System.out.println("THIS POINT IS PRESENT INSIDE THE CIRCLE :");
	 else if(d>r)
	      System.out.println("THIS POINT IS PRESENT OUTSIDE THE CIRCLE :");
		    else
			 System.out.println("THIS POINT IS PRESENT ON THE CIRCLE :");
	}
}	
       	 
	  
	 
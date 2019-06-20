import java.util.*;
class linear
{ 
   public static void main(String[] args)
   {
     Scanner obj=new Scanner(System.in);
	 double x1,x2,x3,y1,y2,y3,d2;
	 System.out.println("ENTER THE CO-ORDINATES OF 1ST POINT :");
	 x1=obj.nextFloat();
	 y1=obj.nextFloat();
	 System.out.println("ENTER THE CO-ORDINATES OF 2nd POINT :");
	 x2=obj.nextFloat();
	 y2=obj.nextFloat();
	 System.out.println("ENTER THE CO-ORDINATES OF 1ST POINT :");
	 x3=obj.nextFloat();
	 y3=obj.nextFloat();
	 d2=(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0;
	 if(d2==0)
	   System.out.println("CO-ORDINATES ARE ON A STRAIGHT LINE ");
	  else
      	System.out.println("CO-ORDINATES ARE NOT ON A STRAIGHT LINE "+d2);
    }
}	
	   
	 
	 
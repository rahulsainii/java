import java.util.*;
class area
{ 
   public static void main(String[] args)
   {
     Scanner obj=new Scanner(System.in);
     int l,b,ar,p;
     Double r,ar1,c;
     System.out.println("enter length and breadth of rectangle :");
  
     l=obj.nextInt();
     b=obj.nextInt();
     ar=l*b;
     p=2*(l+b);
     System.out.println("Now enter the radous of circle :");
     r=obj.nextDouble();
     ar1=3.14*r*r;
     c=2*3.14*r;
     System.out.println("area of rectangle is: "+ar+" \n perimeter of rectangle is :"+p);
     System.out.println("Area of circle is: "+ar1+" \n circumferance of circle is :"+c);
  
    }



}
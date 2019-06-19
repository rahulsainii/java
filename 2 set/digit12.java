import java.util.*;
class digit
{
    public static void main(String[] args)
	{
	    Scanner obj=new Scanner(System.in);
	    int a,n1,n2,n3,n4,n5,sum;
	    System.out.println("enter any five digit no. ");
		a=obj.nextInt();
	    n1=a%10;
	    a=a/10;
   	    n2=a%10;
	    a=a/10;
	 	n3=a%10;
	    a=a/10;
	 	n4=a%10;
	    a=a/10;
		n5=a%10;
		sum=n1+n2+n3+n4+n5;
		System.out.println("SUM OF IT'S DIGITS ARE :"+sum);
		
	
	
	}



}
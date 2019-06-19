import java.util.*;
class sumlast
{
    public static void main(String[] args)
	{
	    Scanner obj=new Scanner(System.in);
	    int a,n1,n2,n3,n4,n5,sum;
	    System.out.println("enter any four digit no. ");
		a=obj.nextInt();
	    n1=a%10;
	    a=a/1000;
	 	n4=a%10;
		sum=n1+n4;
		System.out.println("SUM OF IT'S DIGITS ARE :"+sum);
		
	
	
	}



}
import java.util.*;
class reverse
{
    public static void main(String[] args)
	{
	    Scanner obj=new Scanner(System.in);
	    int a,n1,n2,n3,n4,n5,no;
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
		no=n1*10000+n2*1000+n3*100+n4*10+n5*1;
		System.out.println("reverse no is  :"+no);
		
	
	
	}



}
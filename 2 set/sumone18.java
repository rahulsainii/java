import java.util.*;
class sumone
{
    public static void main(String[] args)
	{
	    Scanner obj=new Scanner(System.in);
	    int a,n1,n2,n3,n4,n5,no;
	    System.out.println("enter any five digit no. ");
		a=obj.nextInt();
	    n1=a%10;
		n1=n1+1;
		n1=n1%10;
	    a=a/10;
   	    n2=a%10;
		n2=n2+1;
		n2=n2%10;
	    a=a/10;
	 	n3=a%10;
        n3=n3+1;
		n3=n3%10;
	    a=a/10;
	 	n4=a%10;
        n4=n4+1;
        n4=n4%10;		
	    a=a/10;
		n5=a%10;
		n5=n5+1;
		n5=n5%10;
		no=n5*10000+n4*1000+n3*100+n2*10+n1*1;
		System.out.println("required no is  :"+no);
		
	
	
	}



}
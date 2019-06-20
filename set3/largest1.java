import java.util.*;
class Largest
{
	static public void main(String[] args)
	{
	  Scanner obj=new Scanner(System.in);
	  int n1,n2,n3,sum;
	  System.out.println("enter any three nos");
	  n1=obj.nextInt();
	  n2=obj.nextInt();
	  n3=obj.nextInt();
	   
	   if(n1>=n2)
	  {
        sum=n1;
	  }
	  else
     { 
      sum=n2; 
	 }	  
	 
	 
	 if(sum>=n3)
	 {
      sum=sum;	 
	 }
	 else
	 {
	  sum=n3;
	 }
	 
	 if(sum==n1&&sum==n2)
	   System.out.println("1st and 2nd nos are largest");
	     else if(sum==n1&&sum==n3)
	       System.out.println("1st and 3rd nos are largest");
		       else if(sum==n2&&sum==n3)
	             System.out.println("2nd and 3rd nos are largest");
				   else if(sum==n1)
	                  System.out.println("1st no. is largest");
					    else if(sum==n2)
	                      System.out.println("2nd no. is largest");
	                        else if(sum==n1&&sum==n2&&sum==n3)
                              System.out.println("ALL NOS ARE EQUAL");
                                 else
								   System.out.println("3rd no. is largest");
    }
}	
                          								 
	  
	 
	 
	 
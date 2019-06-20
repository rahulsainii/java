import java.util.*;

// find largest no using if else only

class input
{
	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
	  int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,sum;
	  System.out.println("Enter ten nos ");
      n1=sc.nextInt();	  
	  n2=sc.nextInt();
	  n3=sc.nextInt();
	  n4=sc.nextInt();
	  n5=sc.nextInt();
	  n6=sc.nextInt();
	  n7=sc.nextInt();
	  n8=sc.nextInt();
	  n9=sc.nextInt();
	  n10=sc.nextInt();
	  if(n1>n2)
	  {
        sum=n1;
	  }
	  else
     { 
      sum=n2; 
	 }	  
	   if(sum>n3)
	   {
         sum=sum;	 
	   }
	   else
	   {
	     sum=n3;
	   }
	     if(sum>n4)
	     {
           sum=sum;	 
	     }
	     else
	     {
	      sum=n4;
	     }
	      if(sum>n5)
	      {
           sum=sum;	 
	      }
	      else
	      {
	       sum=n5;
	      }
	        if(sum>n6)
	        {
              sum=sum;	 
	        }
	        else
	        {
	         sum=n6;
	        }
	          if(sum>n7)
	          {
                sum=sum;	 
	          }
	          else
	          {
	            sum=n7;
	          }
	            if(sum>n8)
	            {
                 sum=sum;	 
	            }
	           else
	            {
	             sum=n8;
	            }
	               if(sum>n9)
	               {
                     sum=sum;	 
	               }
	               else
	               {
	                 sum=n9;
	               }
	                  if(sum>n10)
	                  {
                         sum=sum;	 
	                  }
	                  else
	                  {
	                     sum=n10;
	                  }
	 System.out.println("largest no is :"+sum);
	 }
}	 
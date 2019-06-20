import java.util.*;
class guessday
{
	static public void main(String[] args)
	{
	  Scanner obj=new Scanner(System.in);
	  int year,sum;
	  float total;
	  System.out.println("ENTER any year :");
	  year=obj.nextInt();
	  if(year<1900)
	    total=(1900-year);
	  else
        total=(year-1900);
     
      sum=(int)total+(int)Math.ceil(total/4);	 
	  sum=sum%7;
	  
	    if(sum==1)
	    System.out.println("MONDAY");
		 else if(sum==2)
	       System.out.println("TUESDAY");	
             else if(sum==3)
	         System.out.println("WEDNESDAY");	
               else if(sum==4)
	             System.out.println("THURSDAY");	
                  else if(sum==5)
	                System.out.println("FRIDAY");	
                      else if(sum==6)
	                    System.out.println("SATURDAY");
                          else
							  System.out.println("SUNDAY");
                                         				   
    }
}	
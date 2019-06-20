import java.util.*;
class younger
{
	static public void main(String[] args)
	{
	  Scanner obj=new Scanner(System.in);
	  int ram,shyam,ajay,sum;
	  System.out.println("enter the ages of RAM SHYAM AND AJAY REPECTIVALY ");
	  ram=obj.nextInt();
	  shyam=obj.nextInt();
	  ajay=obj.nextInt();
	   if(ram<=shyam)
	  {
        sum=ram;
	  }
	  else
     { 
      sum=shyam; 
	 }	  
	 
	 
	 if(sum<=ajay)
	 {
      sum=sum;	 
	 }
	 else
	 {
	  sum=ajay;
	 }
	 
	 if(sum==ram&&sum==shyam)
	   System.out.println("ram and shyam  are younger");
	     else if(sum==ram&&sum==ajay)
	       System.out.println("ram and ajay  are younger");
		       else if(sum==shyam&&sum==ajay)
	             System.out.println("shyam and ajay  are younger");
				   else if(sum==ram)
	                  System.out.println("ram is younger");
					    else if(sum==shyam)
	                      System.out.println("shyam is younger");
	                        else if(sum==ram&&sum==shyam&&sum==ajay)
                              System.out.println("ALL ARE OF EQUAL AGE");
                                 else
								   System.out.println("ajay is younger");
    }
}	
                          								 
	  
	 
	 
	 
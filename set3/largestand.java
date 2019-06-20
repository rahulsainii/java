import java.util.*;
class Largestand
{
	static public void main(String[] args)
	{
	  Scanner obj=new Scanner(System.in);
	  int n1,n2,n3;
	  n1=obj.nextInt();
	  n2=obj.nextInt();
	  n3=obj.nextInt();
	  if(n1>n3&&n2>n3)
	  System.out.println("1st and 2nd nos  are larger"); 
	    else if(n1>n2&&n3>n2)
		  System.out.println("1st and 3rd nos are larger");
	        else if(n2>n1&&n3>n1)
				System.out.println("2nd and 3rd nos are larger");   
			      else if(n1>n2&&n1>n3)
			        System.out.println("1st no.is largest");
				      else if(n2>n3&&n2>n1)
						 System.out.println("2nd no. is largest");
					       else if(n1==n2&&n2==n3)
						     System.out.println("ALL THREE NOS ARE EQUAL");
						       else
								   System.out.println("3rd no. is largest");
							   
						   
	
	
	}


}
import java.util.*;
class vote
{
	static public void main(String[] args)
    {
	  Scanner obj=new Scanner(System.in);
	  int a;
	  System.out.println("Enter the age of candidate");
	  a=obj.nextInt();
	  if(a>=18)
	  {
	  System.out.println("candidate can cast vote");
	  }
	  else
	  {
	   System.out.println("candidate can't cast vote");
	  }
	
	
	}

}
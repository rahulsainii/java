import java.util.*;
class student
{
	public static void main(String[] args)
	{
                  Scanner sc=new Scanner(System.in);
	  int n1,n2,n3,n4,n5,agm,pm,sum;
	  System.out.println("Enter the marks of students in five subjects out of 100 :");
      n1=sc.nextInt();	  
	  n2=sc.nextInt();
	  n3=sc.nextInt();
	  n4=sc.nextInt();
	  n5=sc.nextInt();
	  sum=(n1+n2+n3+n4+n5);
	  agm=(sum)/5;
	  pm=(sum*100)/500;
	  System.out.println("Aggregate marks are :"+agm+"\n percentage is :"+pm);
	}
}	
	  
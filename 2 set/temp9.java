import java.util.*;
class temperature
{
    public static void main(String[] args)
	{
	 Scanner obj=new Scanner(System.in);
	 double c,f;
	 System.out.println("Enter temp in fahrenheit :");
	 f=obj.nextFloat();
	 c=(f-32)/1.80;
	 System.out.println(" IN celcius it is :"+c);
	
	
	}


}

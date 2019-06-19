import java.util.*;
class triangle
{
	public static void main(String[] args)
	{
	Scanner obj=new Scanner(System.in);
	int a,b,c;
	System.out.println("enter any two angles of the triangle :");
	a=obj.nextInt();
	b=obj.nextInt();
	c=180-(a+b);
	System.out.println("third angle is: "+c);
	}
}	
	
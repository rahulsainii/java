import java.util.*;
class Profit
{
	static public void main(String[] args)
	{
	  Scanner obj=new Scanner(System.in);
	  double sp,cp,p;
	  System.out.println("ENTER SP AND CP RESPECTIVELY ");
	  sp=obj.nextDouble();
	  cp=obj.nextDouble();
	  if((sp-cp)>0)
	     System.out.println(" THERE IS A PROFIT OF "+(sp-cp)+" rs");
	  else
	     System.out.println(" THERE IS A LOSS OF "+(cp-sp)+" rs");
	}	 
}	
	
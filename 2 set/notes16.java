import java.util.*;
class notes
{
     public static void main(String[] args)
	 {
	   Scanner obj=new Scanner(System.in);
	   int th,ten,fif,n;
	   System.out.println("enter amount :");
	   n=obj.nextInt();
	   th=n/100;
	   n=n%100;
	   fif=n/50;
	   n=n%50;
	   ten=n/10;
	   System.out.println("no of hundred notes required :"+th+"\n no of fifty notes required :"+fif+"\n no of ten rupees notes required :"+ten);
	   
	 
	 }

}
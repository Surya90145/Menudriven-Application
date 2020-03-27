import java.util.*;
class Menudriven10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		do
		{   
			System.out.println("***************************");
			System.out.println("1.ADDITION");
			System.out.println("2.SUBRACTION");
			System.out.println("3.MULTIPLICATION");
			System.out.println("4.DIVISION");
			System.out.println("5.MOD DIVISION");
			System.out.println("***************************");
			System.out.print("Enter ur choice=");
			a=sc.nextInt();
				  System.out.print("ENTER THE VALUE OF THE B=");
			        int b=sc.nextInt();
				  System.out.println(" THE VALUE OF THE B="+b);
			      System.out.print("ENTER THE VALUE OF THE C=");
				    int c=sc.nextInt();
				  System.out.println(" THE VALUE OF THE C="+c);
		switch(a)
		{
			case 1:
				int d=b+c;
			    System.out.println("Sum of b+c="+d);
		       	break;
            case 2:
				  int e=b-c;
			     System.out.println("Subraction of b-c="+e);
				 break;
		    case 3:
				int f=b*c;
			    System.out.println("Multiplication of b*c="+f);
				break;
           case 4:
			   int g=b/c;
		       System.out.println("Division of b/c="+g);
			   break;

		  case 5:
			  int h=b%c;
		      System.out.println("Mod division b%c="+h);
			  break;
		}
		}while(a<=5);
	System.out.println("U enter wrong choice=");
	}
}

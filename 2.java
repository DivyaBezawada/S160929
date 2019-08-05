//FACTORIAL
import java.util.Scanner;
class factorial
{	class fact
	{int fact(int n)
	  {if(n==1||n==0)
		{return 1;
		}
	   else
		{return n*fact(n-1);
		}
	  }
	}
	public static void main(String arr[])
	{System.out.println("ENTER NUM:");
	Scanner a=new Scanner(System.in);
	System.out.print("Enter a num:");	 
	int n=a.nextInt();
	fact myfact=new fact();
	f=myfact.fact();
	System.out.println(f);
	}
}
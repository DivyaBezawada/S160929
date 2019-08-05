//CLASS AND OBJECT
import java.util.Scanner;
class test
{	int a;
	public static void main(String arr[])
	{System.out.println("ENTER NUM:");
	test obj=new test();  //CREATING OBJECT(obj)
	 Scanner obj1=new Scanner(System.in);
	 obj.a=obj1.nextInt();
	 System.out.println("Entered Num="+obj.a);
	}
}


//EMPLOYEE DETAILS
import java.util.Scanner;
class input
{	public static void main(String arr[])
	{Scanner a=new Scanner(System.in);
	System.out.print("Enter ur id:");	 
	int id=a.nextInt();
	System.out.print("Enter ur name:");
	String name=a.next();
	System.out.print("Enter ur Salary:");
	float marks=a.nextFloat();
	System.out.println("ID="+id);
	System.out.println("NAME="+name);
	System.out.println("SALARY="+marks);
	System.out.println("HELLO "+name+"!!");
	}
}
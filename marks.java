//STUDENT INFORMATION
import java.util.Scanner;
class input
{	public static void main(String arr[])
	{Scanner a=new Scanner(System.in);
	System.out.print("Enter ur id:");	 
	int id=a.nextInt();
	System.out.print("Enter ur name:");
	String name=a.next();
	System.out.print("Enter ur marks:");
	float marks=a.nextFloat();
	System.out.println("ID="+id+"\nNAME="+name+"\nMARKS="+marks);
	}
}
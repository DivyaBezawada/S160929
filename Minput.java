import java.util.Scanner;
class test
{	int a;
	void read()
	{System.out.println("ENTER NUM:");
	 Scanner obj1=new Scanner(System.in);
	 a=obj1.nextInt();
	}
	void display()
	{System.out.println(a);
	}
	public static void main(String arr[])
	{test obj=new test();  //Initialize with default values
	obj.read();
 	obj.display();
	obj.a=50;
	obj.display();
	}
}


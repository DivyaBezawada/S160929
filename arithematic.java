import java.util.Scanner;
class input{int res;
	int add(int c,int d)
	{res=c+d;
	 return res;
	}
	int sub(int c,int d)
	{res=c-d;
	return res;
	}
	int mul(int c,int d)
	{res=c*d;
	return res;
	}
	int div(int c,int d)
	{res=c/d;
	return res;
	}
}
class input1{
	public static void main(String ar[])
	{int z;
	Scanner a=new Scanner(System.in);
	System.out.print("Enter 1:");
	int num1=a.nextInt();
	System.out.print("Enter 2:");
	int num2=a.nextInt();
	System.out.println("1.Add\n2.Subtract\n3.Mul\n4.Div\n");
	System.out.print("Enter choice:");
	int n=a.nextInt();
	input obj=new input();
	switch(n){
	case 1:z=obj.add(num1,num2);
		System.out.print(z);
		break;
	case 2:z=obj.sub(num1,num2);
		System.out.print(z);
		break;
	case 3:z=obj.mul(num1,num2);
		System.out.print(z);
		break;
	case 4:z=obj.div(num1,num2);
		System.out.print(z);
		break;
	}
	//System.out.print(z);
	}
}
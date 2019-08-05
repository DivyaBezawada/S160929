//Largest of 3 NUMBERS
class largest
{	public static void main(String arr[])
	{int num1=10,num2=7,num3=55;
	 int max;
	 if(num1>num2&&num1>num3)
	 {max=num1;
	 }
	 else if(num2>num3)
	 {max=num2;
	 }
	else
	{max=num3;
	}
System.out.println("num1="+num1);
System.out.println("num2="+num2);
System.out.println("num3="+num3);
System.out.println("MAX="+max);
	}
}
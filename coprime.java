//CO-PRIME
class coprime
{	public static void main(String arr[])
	{int a=10,b=7;
	 int r;
	 r=a%b;
	 while(r!=0)
	 {a=b;
	  b=r;
	  r=a%b;
	 }
	if(b==1)
	{System.out.print("CO-PRIME");
	}
	else
	{System.out.print("NOT A CO-PRIME");
	}
}
}
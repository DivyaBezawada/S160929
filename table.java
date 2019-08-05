//COMMAND LINE ARGUMENT
class arguments
{	public static void main(String arg[])
	{int i,b;
	 int a=Integer.parseInt(arg[0]);
System.out.println("----------");
	 for(i=0;i<10;i++)
	 {b=a*i;
	
	
	System.out.println("|"+a+"*"+i+"="+b+"|");
	 }System.out.println("----------");
	}
}
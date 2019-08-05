//INDEX OF SMALL NUMBER
class index
{	public static void main(String arr[])
	{int a[]={111,02,30,48,53};
	 int small=a[0],i,index=0;
	for(i=0;i<a.length;i++)
	{if(a[i]<small)
	 {small=a[i];
	  index=i;
	 }
	}
	for(i=0;i<a.length;i++)
	{System.out.println(a[i]);
	}
System.out.println("Small num index="+index);
	}
}
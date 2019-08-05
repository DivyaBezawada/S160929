//LARGEST AND SMALLEST NUMBERS
class large
{	public static void main(String arr[])
	{int a[]={32,44,22,5,6,1,0};
	 int large=a[0],small=a[0],i;
	 for(i=1;i<a.length;i++)
	 { if(large<a[i])
	   {large=a[i];
	   }
	 }
	for(i=1;i<a.length;i++)
	 { if(small>a[i])
	   {small=a[i];
	   }
	 }
	for(i=0;i<a.length;i++)
	 { System.out.println(a[i]);
	 }
	System.out.println("large="+large);
	System.out.print("small="+small);
	}
}
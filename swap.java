//Interchanginig smallest nd largest

class swap
{	public static void main(String arr[])
	{int a[]={32,44,22,5,6,1,0},l=0,s=0,temp;
	 int large=a[0],small=a[0],i;
	 for(i=1;i<a.length;i++)
	 { if(large<a[i])
	   {large=a[i];
	     l=i;
	   }
	 }
	for(i=1;i<a.length;i++)
	 { if(small>a[i])
	   {small=a[i];
	    s=i;
	   }
	 }
	for(i=0;i<a.length;i++)
	 { System.out.println(a[i]);
	 }
	 temp=a[l];
	a[l]=a[s];
	a[s]=temp;
	System.out.println("-------NEW------");
	for(i=0;i<a.length;i++)
	 { System.out.println(a[i]);
	 }
	}
}
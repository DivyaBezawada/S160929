//SORTING THE ARRAY
class sort
{	public static void main(String arr[])
	{int a[]={191,22,36,14,50},small=a[0],temp,i,j=0;
	 for(i=0;i<a.length;i++)
	{
 	 System.out.println(a[i]);
	}
	for(i=0;i<a.length;i++)
	{for(j=i+1;j<a.length;j++)
 	{if(a[i]>a[j])
	{temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
 	}
	}
	System.out.println("AFTER SORT");
	for(i=0;i<a.length;i++)
	{
 	 System.out.println(a[i]);
	}
	}
}
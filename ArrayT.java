//AVERAGE OF THE ELEMENTS IN AN ARRAY
class ArrayTwo
{	public static void main(String arr[])
	{
	double a[]={1.5,2.3,3.6,4.78},sum=0;
	 int i;
	 double avg;//sum=0;
	for(i=0;i<a.length;i++)
	{sum=sum+a[i];
	}
	avg=sum/(a.length);
	
	System.out.print(avg);	
}
}
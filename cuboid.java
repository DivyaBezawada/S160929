//VOLUME OF CUBOID
import java.util.Scanner;
class cuboid{
	int length;
	int breadth;
	int heigth;
	int volume(int x,int y,int z){
	return (x*y*z);
	}
}
class cal{
	public static void main(String ar[]){
	System.out.println("Enter length:");
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	System.out.println("Enter breadth:");
	int b=sc.nextInt();
	System.out.println("Enter height:");
	int h=sc.nextInt();
	cuboid obj=new cuboid();
	obj.length=l;
	obj.breadth=b;
	obj.heigth=h;
	int v1=obj.volume(l,b,h);
	System.out.println("VOLUME 1="+v1);
	cuboid obj1=new cuboid();
	System.out.println("Enter length:");
	int le=sc.nextInt();
	System.out.println("Enter breadth:");
	int br=sc.nextInt();
	System.out.println("Enter height:");
	int he=sc.nextInt();
	obj1.length=le;
	obj1.breadth=br;
	obj1.heigth=he;
	int v2=obj1.volume(le,br,he);
	System.out.println("VOLUME 2="+v2);
	}
}
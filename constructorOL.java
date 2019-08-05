//constructor overloading or polymorphism
//we can't invoke constructor implicitly
class area{
	int l,w;
	double r;
	double b,h;
	area(double x){
	System.out.println("Area Of Circle="+Math.PI*x*x);
	}
	area(int a,int b){
	l=a;w=b;
	System.out.println("Area Of rectangle="+l*w);
	}
	area(double x,double y){
	System.out.println("Area Of Triangle="+0.5*x*y);
	}
}
class geometry{
	public static void main(String ar[]){
	area ob=new area(10,20);
	area ob1=new area(1.25,2.25);
	area ob2=new area(5.5);
	}
}
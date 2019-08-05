//method overloading or polymorphism
class area{
	int l,w;
	double r;
	double b,h;
	void area(double x){
	System.out.println(Math.PI*x*x);
	}
	void area(int a,int b){
	System.out.println(a*b);
	}
	void area(double a,double b){
	System.out.println(0.5*a*b);
	}
	
}
class geometry{
	public static void main(String ar[]){
	area ob=new area();
	ob.area(5.5);
	ob.area(1.25,2.25);
	ob.area(10,20);
	}
}
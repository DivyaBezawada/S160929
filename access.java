//CONSTRUCTOR CALL AND SCOPE OF VARIABLES
class type1{
	public static void main(String ar[]){
	int a=15,b=60;
	System.out.println(a+" "+b);
	example ob=new example();
	ob.display();
	System.out.println(a+" "+b);
	}
}
class example{
	int a,b;
	example(){
	a=10;
	b=20;
	}
	void display(){
	System.out.println(a+" "+b);
	}
}

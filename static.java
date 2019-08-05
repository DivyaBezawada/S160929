//PRIORITY OF STATIC BLOCK
class test{
	static int a=10;
	static int b;
	static void display(){
	System.out.println(a);
	System.out.println(b);
	}
	static{	//preference is given to static block to execute
	System.out.println("STATIC");
	b=a*10;
	}
	public static void main(String arr[]){
	System.out.println("MAIN");
	display();
	}
}
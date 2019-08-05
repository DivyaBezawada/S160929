//METHODS AND CONSTRUCTORS
class test{
	//static int a=10;
	int a=10;
	//static void display(){
	void display(){
	System.out.println("HI");
	System.out.println(a);
	}
	public static void main(String arr[]){
	/*a=50;
	display();	//no need to mention the class name ...coz both are in same class instead of being in different!*/
	test ob1=new test();
	test ob2=new test();
	ob1.display();
	ob2.display();
	
	}
}
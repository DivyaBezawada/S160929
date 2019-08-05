//METHODS AND CONSTRUCTORS
class test{
	int a;
	test(){
	System.out.println(a);}
	test(int x){
	a=x;
	System.out.println(a);
	}
	void display(){
	System.out.print(a);
	}
}
class test_program{
	public static void main(String ar[]){
	test ob=new test();
	test ob2=new test(100);
	ob.a=20;
	ob2.a=30;
	}
}
//Constructor invokes at the time of defining obj!
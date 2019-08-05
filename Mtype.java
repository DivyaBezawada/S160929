class test
{	
	void type2(){
	int a=50;
	System.out.println(a);
	}
	void type2(int x){
	System.out.println(x);
	}
	void type2(char x){
	System.out.println(x);
	}
	void type2(double x){
	System.out.println(x);
	}
	int type3()
	{int a=50;
	return a;
	}
	int type3(int x){
	return x;
	}
	char type3(char x){
	return x;
	}
	double type3(double x){
	return x;
	}
}
class test_p
{	public static void main(String arr[]){
	test obj=new test();
	System.out.println("----VOID----");
	obj.type2();
	obj.type2(100);
	obj.type2('D');
	obj.type2(10.567);
	int f=obj.type3();
 	int c=obj.type3(100);
	char d=obj.type3('D');
	double e=obj.type3(10.567);
	System.out.println("\n----INT----");
	System.out.println(f+"\n"+c+"\n"+d+"\n"+e);
	}
}
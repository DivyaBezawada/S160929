//VARIOUS STRING CREATIONS
class length1{	
	public static void main(String ar[]){
	String s;
	s="HELLO";
	String s1="HELLO1";
	String s2=new String("HELLO2");
	char arr[]={'a','b','c','d','e','f'};
	String s3=new String(arr);
	String s4=new String(arr,1,3);
	System.out.print(s+"\n"+s1+"\n"+s2+"\n"+s3+"\n"+s4);
	}
}
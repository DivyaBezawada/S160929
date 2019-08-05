//SOME OF THE STRING METHODS
class creating{	
	public static void main(String ar[]){
	String a="HELLO";
	String b="hello";
	String c=a.concat(b);
	int d=a.compareTo(b);
	System.out.println("length(5) = "+a.length()+"\n"+"E = "+a.charAt(1)+"\n"+c+"\n"+"EQUAL = "+d);
	int e=a.compareToIgnoreCase(b);
	boolean f=a.equals(b);
	boolean g=a.equalsIgnoreCase(b);
	boolean h=a.startsWith("HE");
	boolean i=a.endsWith("HE");
	int j=a.indexOf("EL");
	int k=a.indexOf("EO");
	int l=a.lastIndexOf('L');
	System.out.println(e+"\n"+f+"\n"+g+"\n"+h+"\n"+i+"\n"+j+"\n"+k+"\n"+l);
	String m=a.replace('E','A');
	String n=a.substring(0);	
	String o=a.substring(0,3);
	String p=a.toLowerCase();
	String q=b.toLowerCase();
	String r="   Hi Ellen   ";
	String s=r.trim();
	System.out.println(m+"\n"+n+"\n"+"\n"+o+"\n"+p+"\n"+q+"\n"+"BEFORE :"+r+"\n"+"AFTER :"+s);
	void getChars(0,5,char arr[],0);
	//for(int z=0;z<
	}
}
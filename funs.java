class length1
{	public static void main(String arr[])
	{String s1="HELLO123";
	 String s2="HEL LO VE";
	 String s3="Hello";	
	 String s4="hi";
	String sub=s1.substring(2,4);
	String sub1=s1.substring(2);
//	String D="hhhhhh";
	 int c=s1.compareTo(s3);
	 System.out.println(s1.compareTo(s2));
	 System.out.println(s1.compareToIgnoreCase(s3));
	 System.out.println(c);
	System.out.println(s1.equals(s2));
	System.out.println(s1.startsWith("H"));
	System.out.println(s3.endsWith("lo"));
	System.out.println(sub);
	System.out.println(sub1);
//Can use either single or Double quotes for chars
	System.out.println("Replacing h with D= "+s4.replace("h","D"));
	System.out.println("s4= "+s4);
	System.out.println("Replacing HE with BE= "+s1.replace("HE","BE"));
//replace first is only to replace strings not for characters
	System.out.println(s1.replaceFirst("HE","fe"));
//length
	System.out.println("Length="+s1.length());
	System.out.println("S2 Length="+s2.length());
	}
}
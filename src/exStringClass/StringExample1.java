package exStringClass;


public class StringExample1 
{
	
	//string pool area constant pool area without new 
	public static void main(String[] args) {
		
	
	String str1="Lakhan";
	System.out.println(str1);
	String str2="Lakhan";
	System.out.println(str2);
	System.out.println("------------");
	
	String nstr=new String("Lakhan Adewar");
	System.out.println(nstr);
	String nstr1=new String("Lakhan Adewar");
	System.out.println(nstr1);
	}
}

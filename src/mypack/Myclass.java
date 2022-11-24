package mypack;

public class Myclass {

	public static void main(String[] args) {
		
		m1();
		
		Myclass obj=new Myclass();
		obj.m2();
		
	}
	
	
	public static void m1()
	{
		System.out.println("Static Method!");
				
	}
	
	public void m2()
	{
		System.out.println("Non-Static Method");
		m1();
		m3();//non-static method
	}
	
	public void m3()
	{
		
		System.out.println("Non-Static Method m3");
	}
}

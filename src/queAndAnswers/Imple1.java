package queAndAnswers;

public class Imple1 implements Inter2
{
	
	public void m1()
	{
		System.out.println("Method 1 from interface 1");
	}
	public void m2()
	{
		System.out.println("Method 2 from interface 1");
	}
	public void m3()
	{
		System.out.println("Method 3 from interface 1");
	}
	public void m4()
	{
		System.out.println("Method 4 from interface 2");
	}
	public void m5()
	{
		System.out.println("Method 5 from interface 2");
	}
	public void m6()
	{
		System.out.println("Method 6 from interface 2");
	}
	
	public static void main(String[] args) {
		
		Imple1 ca=new Imple1();
		ca.m1();
		ca.m2();
		ca.m3();
		ca.m4();
		ca.m5();
		ca.m6();
	
	
	String[] name= {"Lakhan","Adewar","Amravati"};
	
	String y= name[0].concat(name[1]);
	
	System.out.println(y);
	}
	
	
	
}

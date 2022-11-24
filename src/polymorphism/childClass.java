package polymorphism;

public class childClass extends parentClass
{

	public void add()//childclass method
	{
		int a=21,b=34;
		int sub=a-b;
		System.out.println(sub);
	}
	
	public void add(int c)//parentclass/superclass
	{
		int a=c,b=32;
		int sum=a+b;
		System.out.println(sum);
		
	}
	

}

package Tasks;

public class example1 {
	int a=12, b=21;//nonstatic global variable
	
	public static void main(String[] args) {
	example1 obj1=new example1();
	obj1.met1();
	System.out.println(obj1.a);
	met2();
	}
	
	public void met1()
	{
		System.out.println(a);
	}
	
	public static void met2()
	{
		example1 obj2=new example1();
		System.out.println(obj2.a);
		
	}
	
}

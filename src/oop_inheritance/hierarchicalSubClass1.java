package oop_inheritance;

public class hierarchicalSubClass1 extends hierarchicalParentClass
{
int a,b,c,i;//nonstatic global variable
	
	public void useifelse(int f, int g, int h)//campair 3 no's
	{	a=f;b=g;c=h;
		
		if(a>=b && a>=c)
		{
			System.out.println(a+" is Greater number than "+b+","+c);
		}else if (b>=a && b>=c)
		{
			System.out.println(b+" is Greater number than "+a+","+c);
		}else
		{
			System.out.println(c+" is Greater number than "+a+","+b);
		}
	}
	
}

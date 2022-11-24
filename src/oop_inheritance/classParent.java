package oop_inheritance;

public class classParent //super/parent class/base class
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
	public void usewhile(int x) //value print upto pass value
	{ a=x;
		while(i<=a)
		{
			System.out.println(i);
			i++;
		}
	}
	
	public void useswitch(int y) //switch simple
	{ b=y;
		
	switch(b)
	{
	case 1:
		System.out.println("Case 1 Excuated");
		break;
	case 2:
		System.out.println("Case 2 Excuated");
		break;
	case 3:
		System.out.println("Case 3 Excuated");
		break;
	case 4:
		System.out.println("Case 4 Excuated");
		break;
	case 5:
		System.out.println("Case 5 Excuated");
		break;
	default:
		System.out.println("Case Not Exist");
		break;
	}
	}
	
	
}

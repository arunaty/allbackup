package oop_inheritance;

public class hierarchicalParentClass {
	int a,b,c,i;
	String stdnm;
	float area, pi=3.14f;
	public void evenOdd(int x)
	{	a=x;
		if(a%2==0)
		{
			System.out.println(a+" number is Even");
		}else
		{
			System.out.println(a+" number is Odd");
		}}
	
	public void circleuse(int x)
	{	
		area=pi*(x*x);
		System.out.println("Area Of Circle "+area+" square cm");		
	}

	public void trifind(int x,int y, int z)
	{
		if(x+y+z==180)
		{
		System.out.println("It is Triangle");
		}else
		{
			System.out.println("Not a Triangle");
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
	}}
	public void douseaz(char y)
	{ char a=y;
		for(a='A';a<=y;a++)
		{
			System.out.println(a);
		}
	}}

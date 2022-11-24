package oop_inheritance;

public class multiC1 {
	int a,b,c;
	float pi;
	float area;
	public void circleuse(int x)
		{	pi=3.14f;
		area=pi*(x*x);
		System.out.println("Area Of Circle "+area+" square cm");		
		}
	
	public void trifind(int x,int y, int z)
		{if(x+y+z==180){System.out.println("It is Triangle");}
		else{System.out.println("Not a Triangle");}}}

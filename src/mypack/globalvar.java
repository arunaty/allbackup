package mypack;

public class globalvar 
{
	int a,b,c;
public static void main(String[] args) {
		
		globalvar n1=new globalvar(12, 23, 34);
		n1.m2();
	}
	
globalvar(int x, int y, int z) {
		a=x;
		b=y;
		c=z;
	
	}
	
	
	
	
	void m2()
	{
		System.out.println(a+" "+b+" "+c);		
	}
	
	
}

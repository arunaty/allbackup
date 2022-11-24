package mypack;

public class usePrivate 
{
	//private 
	int x=23,y,z;//nonstatic global variable
	public void m1() {
		
		
		int x=13;
		System.out.println(this.x);
		System.out.println(x);
		//System.out.println(super.x);
	}
	
	
	
	
	
	public static void main(String[] args)//main methods
		{	
			usePrivate c1=new usePrivate();//object creation
			c1.m1();
			
			//c1.cal(12,36,48);
//			
//			c1.zToa();
//			
//			c1.useWhile();
		}
//	
//	private void cal(int a,int b,int c)
//	{
//		x=a;y=b;z=c;//assign
//		
//		System.out.println("Sum is "+(x+y+z));
//		
//	}
//	
//	private void zToa()
//	{
//		for(char a='Z';a>='A';a--)
//		{
//			System.out.print(a+"\t");
//		}
//	}
//	
//	private void useWhile()
//	{
//		x=10;
//		while(x>=1)
//		{
//			System.out.print(x+"\t");
//			x--;
//		}
//		
//		
//	}
	
	
}

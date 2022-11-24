package exupcasting;

public class FirstChildClass extends SupermostClass
{
	void useDoWhile()
	{
	// only odd no from 100 to 1 in reverse
			int d=100;
			int c=0;
			do // exit control loop
			{
				c=d%2;
				if(c==0)
				{
					
				}else//only odd
				{
					System.out.println(d);
				}
				d--;
				
			}while(d>=1);
	}
	//sample 1 methods
	
	public void uFor()
	{
		for(int i=10;i>0;i--)
		{
		System.out.println(i);
		}
	}
	public void uWhile()
	{
		int i=10;
//		byte a=24;
//		int b=a;//implicite Casting-lower datatype 
		while(i>0)
		{
			System.out.println(i);
			i--;
		}
				
	}
	
}

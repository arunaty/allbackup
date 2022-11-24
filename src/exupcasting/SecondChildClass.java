package exupcasting;

public class SecondChildClass extends FirstChildClass
{
	public void add()//parentclass/superclass
	{
		int a=10,b=32;
		int sum=a+b;
		System.out.println(sum);
		
	}
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
	
	
}

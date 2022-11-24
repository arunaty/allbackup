package interClass;

public class methClass extends varClass
{

	protected void useDoWhile()
	{
		
		// only odd no from 100 to 1 in reverse
		d=100;
		c=0;
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
	public static void met2()
	{
		System.out.println("This a static method");
	}
	
	
	
}

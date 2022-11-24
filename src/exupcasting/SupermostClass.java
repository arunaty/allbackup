package exupcasting;

public class SupermostClass {

	public void uFor()
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println(i);
		}
	}
	public void uWhile()
	{
		int i=1;
		byte a=12;
		int b=a;//implicite Casting-lower datatype  to higher data type
		while(i<b)
		{
			System.out.println(i);
			i++;
		}
				
	}
	
}

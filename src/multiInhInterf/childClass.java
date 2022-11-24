package multiInhInterf;

public class childClass implements fatherClass,motherClass
{
	public void usefor()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+"\t");
		}
	}
	
	public void useWhile()
	{
		int i=1;
		
		while(i<=10)
		{
			System.out.print(i+"\t");
			i++;
		}
	}
	
	public void useDoWhile()
	{
		int i=1;
		do
		{
			System.out.print(i*21+"\t");
			i++;
		}while(i<=10);
	}
	public void useSwitch(int a)
	{
		switch(a)
		{
		
		case 1:
			System.out.println("This is Case 1");
			break;
		case 2:
			System.out.println("This is Case 2");
			break;
		case 3:
			System.out.println("This is Case 3");
			break;
		case 4:
			System.out.println("This is Case 4");
			break;
		default:
		System.out.println("Default Case");
		
		}
	}
	
	
}

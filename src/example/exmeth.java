package example;

public class exmeth {

	public void table21()//nonstatic method 
	{
		for(exvarclass.a=1;exvarclass.a<=10;exvarclass.a++)
			{
			System.out.println(exvarclass.a*21);
			}
	}
	
	public void useladder()
	{
		exvarclass mk=new exvarclass();
		mk.marks=78;
		if(mk.marks>=85)
		{
			System.out.println("First Class");
		}else if(mk.marks>=75)
		{
			System.out.println("Second Class");
		}else if(mk.marks>=65)
		{
			System.out.println("Third Class");
		}else
		{
			System.out.println("You are Fail");
		}}
	public static void useswitch()
	{
		exvarclass.a=2;
		
		switch(exvarclass.a)
		{
		case 1:
			System.out.println("This Is case 1");
			break;
		case 2:
			System.out.println("This Is case 2");
			break;
		case 3:
			System.out.println("This Is case 3");
			break;
		default:
			System.out.println("Enter Vaild Case No.");
			break;
		}
		
	}
	
	
}

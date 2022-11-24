package interClass;

public class varClass {

	public  int a; //can be access inside a project
	
	private int b; // access within the class
	
	int c; // within package
	
	protected int d; // within package and another package with inheratance
	
	
	public void useFor()// decalartion of nonstatic method-memory area heap area
	{// defination is stored method area
		
		b=29;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*b);
		}
		
	}
	
	
}

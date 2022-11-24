package Tasks;

public class useConstOtherClass {

	int n1;
	int n2;
	String enm;
	String ecom;
	char sgrade;
	float epk;
	
	useConstOtherClass(int a, int b) //Constructor no 1 
									//for assignig numbers
		{
			n1=a;
			n2=b;
	
		}
	useConstOtherClass(String empname, String empcomp, char salg, float packg) 
	// 2nd constructor for passing employee data
	{
		enm=empname;
		ecom=empcomp;
		sgrade=salg;
		epk=packg;
		
	}
	
	
	public void usefornwhile()
		{
		
		// print table of passed value in n1
		System.out.println("For loop use to print Multiplication table of "+n1+"\n");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i*n1+"\t");
		}
		
		System.out.println("\n Use of for Loop To Print No upto "+n2+"\n");
				
		for(int j=1;j<=n2;j++)//checking no for required no
			{
			System.out.println(j);}
		}
		
	public void empdata()
	{
		
		System.out.println("Employee name: "+enm);
		System.out.println("Company name: "+ecom);
		System.out.println("Salary Grade: "+sgrade);
		System.out.println("Pacakage: "+epk);
		
		
	}}
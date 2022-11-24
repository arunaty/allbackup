package constructoruse;

public class multipleconstructor {
	int rollno;
	String name;
	float marks;
	char grade;
	String result;
	int class1;
	
	
	multipleconstructor (int rno, String snme)//constructor 1
		{
			rollno=rno;
			name=snme;
		}
	
	multipleconstructor (float mrk,char grd)//constructor 2
		{
			marks=mrk;
			grade=grd;
		}
	multipleconstructor (String rslt,int class2)//constructor 3
		{
			result=rslt;
			class1=class2;
		}
	
	public static void main(String[] args)
	{
	//	System.out.println("Method 1 Call\n");
	multipleconstructor ml=new multipleconstructor (9, "Niraj");
	
	ml.detail1();
	multipleconstructor m2=new multipleconstructor (77.88f, 'A');
	m2.detail2();
	multipleconstructor m3=new multipleconstructor ("Pass", 10);
	m3.detail3();
	
	
	System.out.println("Method 4 Call\n");
	multipleconstructor m4=new multipleconstructor(34.89f,'A');
	
	m4.multipl();
	}
		
	public void multipl()
		{
			if (marks>=65.0f)
			{
			System. out.println ("With Distinction");
			}
			else if (marks>=35.0f)
			{
			System. out.println("only pass");
			}
			else
			{
			System. out.println("Fail!!");
			}
		}

	public void detail1()
	
		{
		System.out.println("Roll no:\t"+rollno);
		System.out.println ("Name:\t"+name);
		}
	public void detail2()
	
	{
	System.out.println ("Marks:\t"+marks);
	System.out.println ("Grade:\t"+grade);
	}
	
	public void detail3()
	{
		System.out.println ("Result:\t"+result);
		System.out.println("Standard:\t"+class1);
	}
}

package constructoruse;

public class mainclass {

	public static void main(String[] args)
	{
		System.out.println("Method 1 Call\n");
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
	
	
	
}

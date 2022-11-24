package interClass2;
import interClass.*;//package name from which we want the objects

public class mainClass extends methClass
{

	public static void main(String[] args)
	{
		mainClass n1=new mainClass();
		n1.useDoWhile();		
		n1.useFor();
		n1.a=12;
		System.out.println(n1.a);
		
	}
	
}

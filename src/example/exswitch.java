package example;

public class exswitch {
	public static void main(String[] args)
	{
		int option=1;
		int a=10,b=20,c;
		   
	switch(option)//5
	{
		case 1:c=a+b;
		   	System.out.println("addition="+c);
		   	break;
		case 2:c=a-b;
	   		System.out.println("sub="+c);
		   	break;
		case 3:c=a*b;
	   		System.out.println("mul="+c);
		   	break;
		case 4:c=a/b;
	   		System.out.println("div="+c);
		   	break;
		default:
		   	System.out.println("plz enter the valid option");
		   
		   }	}}

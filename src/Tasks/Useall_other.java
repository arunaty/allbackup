package Tasks;
public class Useall_other {
	public static void foruse()//static without parameter [for loop]
		{for(int i=10;i>=1;i--)
			{System.out.print(i+"\t");//reverse 10 to 1
			}}
	public void whileuse()//nonstatic without parameter[while loop]
	{int b=1;
		while(b<=10)
		{System.out.print(b*8+"\t");//table of 8
			b++;		}
	}
	public static void dowhileuse(int c)//static with parameter[dowhile loop]
	{int a=1;
		do
		{System.out.print(a*c+"\t"); //table of any this pass no during passing
			a++;}while(a<=10);	}
	public void ifelseuse(int d, int e)//nonstatic with parameter[if else control statement]
{		if(d>e)
			{System.out.print(" Value of D "+d+" is Greater than value of E "+e);}	
		else{System.out.print(" Value of D "+d+" is Less than value of E "+e);}}}

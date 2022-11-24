package Tasks;
public class useifelseladder {
public static void main(String[] args) {
	System.out.println("Your Semister Result: ");
	useifelseladder obja=new useifelseladder(); //calling non-static method
	obja.ifelse(35);
	System.out.println("\nChecking username and Password");
	otherusernested.nestedif();//calling of static method
}
	public void ifelse(int a)//nonstatic regular method with parameter
		{
		if(a>=85)
		{System.out.println("You got "+a+" % First Class with Distinction");
		}else if (a>=75)
		{System.out.println("You got "+a+" % First Class");
		}
		else if (a>=65)
		{System.out.println("You got "+a+" % Second Class");
		}else if (a>=60)
		{System.out.println("You got "+a+" % Third Class");
		}else if (a>=55)
		{System.out.println("You got "+a+" % Pass only");
		
		}else
		{System.out.println("You got "+a+" % Failed");
		}}}

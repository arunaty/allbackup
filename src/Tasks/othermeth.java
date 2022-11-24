package Tasks;

public class othermeth {
	public static void tablemet()//table print of 21
	{
		for(varclass.a=1;varclass.a<=10;varclass.a++){
			System.out.println(varclass.a*21);
		}}
	
	public void useifelse()//compair  global static variable
	{
		varclass.a=12;//value assigned
		varclass.b=21;
		if(varclass.a>varclass.b)//compaired
			{
				System.out.println(varclass.a+" Value is Greater "+varclass.b);
			}
		else
			{
				System.out.println(varclass.a+" Value is Lesser "+varclass.b);
			}}
	public void useifelseladder()// ladder statement global static variable
	{
		varclass.a=75;//value assigned to global static variable
		if(varclass.a>=80){
			System.out.println("First Class");
		}else if (varclass.a>=70)		{
			System.out.println("Second Class");
		}else if (varclass.a>=60){
			System.out.println("Third Class");
		}else{
			System.out.println("Fail");
		}}
	
	public void usenested()//nested if using global static variable
	{
		varclass.a=50;
		varclass.c=17;
		if(varclass.c>=18)//outer if 
		{
			System.out.println("Your age is "+varclass.a);
			if (varclass.a>=50){
				System.out.println("You can Donate Blood!");
			}else{
				System.out.println("Please Gain Some Weight");}
			}else
		{
			System.out.println("You age is Under 18 Not Eligible to donate Blood.");}}
	
	public void usewhile()// while method to print table of 1.2 float value 
	{
		varclass objf=new varclass(); // created a object to call a non-static variable and use here
		objf.d=1.2f;// value assigned to global non static variable
		objf.e=1.0f;
		while (objf.e<=10)
		{
			System.out.println(objf.e*objf.d);
			objf.e++;}}}

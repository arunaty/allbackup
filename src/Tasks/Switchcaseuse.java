package Tasks;

public class Switchcaseuse {
	public static void main(String[] args) {
		int a=6, b=1,c=53, d=32;//decalaration of variable
		switch(a)//using switch statement
			{case 1:for(int i=1;i<=10;i++)//table of 23 
				{System.out.println("23 x "+i+"="+i*23);}break;
			case 2:	int i=1;do//printing table of 19
				{System.out.println("19 x "+i+"="+i*19);i++;}while(i<=10);
				break;
			case 3:while(b<=10){System.out.println(b);b++;}	break;
			case 4://which is greater
				if(c>=d){System.out.println(c+" is greater "+d);}else
				{System.out.println(d+" is greater "+c);}break;
			case 5:	int z=76;if(z>=85)
					{System.out.println("You got "+z+" % First Class with Distinction");
					}else if (z>=75)
					{System.out.println("You got "+z+" % First Class");	}
					else if (z>=65)
					{System.out.println("You got "+z+" % Second Class");}
					else if (z>=60){System.out.println("You got "+z+" % Third Class");}
					else if (z>=55){System.out.println("You got "+z+" % Pass only");}
					else{System.out.println("You got "+z+" % Failed");}break;
			case 6:	
				double w=100;//weight
				double h=1.99;//height in m
				double bmi=(w/(h*h));//calculating BMI
				System.out.print("Your BMI is ");
				System.out.printf("%.2f",bmi);
				System.out.print(" kg/sqm \n");
				if(bmi>18.5)	
				{
					if(bmi>=25.0 && bmi<=30.0)
					{
						System.out.println("You are Overweight!");
					}else if (bmi>=18.5 && bmi<=24.9)
					{
						System.out.println("You are healthy");
					}else
					{
						System.out.println("Obesity!!");
					}}else
					{
					System.out.println("Your are Underweight");
					}
				break;
			default:
				System.out.println(a+" Case no. is not Valid");
						}}}

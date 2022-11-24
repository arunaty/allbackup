package oop_inheritance;
public class multiC3 extends multiC2
{
	public void usenested()
	{
	int a=45;
	int b=167;
	float bmi=(a/(b&b));//calcuating Body mass index in kh/sq cm
	if(bmi>=18.5)
		{
			if(bmi>=18.5 && bmi<=24.5)
			{System.out.println("Healthy");
			}if(bmi>=24.5 && bmi<=30)
			{System.out.println("Overweight");
			}
			else
			{System.out.println("Obesity");
			}}else{		System.out.println("Underweight");}}}

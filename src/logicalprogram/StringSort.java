package logicalprogram;

public class StringSort {

	//String[] str1= {"Lakhan","Nilesh","Lakhan Adewar","Snehal","Rashmi","Harsha","Shrutika","Jagdish","Hemant Itnare","Automation by Swapnil Sir"};
	//*
	//**
	//***
	//****
	//*****
	//*****
	//*   *
	//*   *
	//*   *
	//*****
	
	public static void main(String[] args) {
			
//	for(int i=1;i<=5;i++)//row
//	{
//		for(int j=1;j<=5;j++)
//		{
//			if(j>=i)//true
//			{
//				System.out.print("*");
//			}else
//			{
//				System.out.print(" ");
//			}		
//		}				
//		System.out.println();
//		}
//	
//	}					0		1		2
					//lakhan subhash adewar
		String str="Lakhan Subhash Adewar";
		
		//String[] spa=str.split(" ");
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
		
		
		System.out.println(rev);
		
		
		
		
		
	}
	
}

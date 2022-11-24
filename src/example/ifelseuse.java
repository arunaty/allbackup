package example;

public class ifelseuse {
	public static void main(String[] args) {  
		int marks=62;
		  
		   if(marks>=65)  //62>=65   //condition1--false
		   {
			   System.out.println("Distinction");		   }
		   else if(marks>=60)  // 62>=60        //condition2--true
		   {
			   System.out.println("1st class");		   }
		   else if(marks>=55)  //10>=55        //condition3--false
		   {
			   System.out.println("higher 2nd class");		   }
		   else if(marks>=50)   //10>=50 //condition 4---false
		   {
			   System.out.println("2nd class");		   }
		   else if(marks>=35)  //10>=35  //condition 5--false
		   {
			   System.out.println("pass");		   }
		   else
		   {
			   System.out.println("fail");		   }
		   	}	}

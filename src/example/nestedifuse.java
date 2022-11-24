package example;

public class nestedifuse {
	public static void main(String[] args)
	{
			
		 String UN="abc";
		 String PWD="xyz";
		 
		 if("abc"==UN)//outer if//abc=abc
		 {
			 System.out.println("correct UN");
			 if("xyz1"==PWD) //innerif
			 {
				System.out.println("correct Pass:login successful"); }
			 else
			 {
				 System.out.println("incorrect Password:login failed");} 	 
		 }
		 else
		 {
			 System.out.println("incorrect UN");}
	}}

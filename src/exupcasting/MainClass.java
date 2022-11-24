package exupcasting;

public class MainClass {

	public static void main(String[] args) {
		
	SupermostClass s1=new SecondChildClass();//upcasting
	s1.uFor();
	s1.uWhile();
	
	
	FirstChildClass s2=new SecondChildClass();
	s2.uFor();
	s2.useDoWhile();
	s2.uWhile();
	
	
	
	
	
	}
}

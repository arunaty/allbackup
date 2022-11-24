package Tasks;

public class Useall {
public static void main(String[] args) {
	System.out.println("Reverse No, For loop: ");
	Useall_other.foruse();//call from other static method without parameter
	
	System.out.println("\nTable of 8, while loop: ");
	Useall_other wobj=new Useall_other();//object for other class
	wobj.whileuse();//call nonstatic method without parameter
	
	System.out.println("\nTable of 21, do While: ");
	Useall_other.dowhileuse(21);//static with parameter
	
	System.out.println("\nValue Compair, if else: ");
	wobj.ifelseuse(12, 24);//nonstatic with parameter
}
}
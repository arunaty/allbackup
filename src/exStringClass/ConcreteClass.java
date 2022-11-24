package exStringClass;

public class ConcreteClass extends operaWithString
{

	public static void main(String[] args) {
		
		ConcreteClass me=new ConcreteClass();
		me.operaOne();
		me.operaTwo();
		me.operaThree();
	}
	
	
	public void operaOne()
	{
	System.out.println("Length of String at 4 Index:"+(str1[4].length()));System.out.println("-----");
	System.out.println("Make Upercase: "+str1[3]+"->"+str1[3].toUpperCase());System.out.println("-----");
	System.out.println("Make Lower Case "+str1[2]+"->"+str1[2].toLowerCase());System.out.println("-----");
	
	}
	
	public void operaThree()
	{
		//start with to compair string start with char or not 
		System.out.println("Check String Start With "+str1[1].substring(2)+" -> "+str1[1].startsWith("la"));
	
		System.out.println("-----");
		
		System.out.println("Check String Ends With "+str1[1].substring(4)+" -> "+str1[1].endsWith("an"));
		System.out.println("------");
		System.out.println("Printing Substring "+str1[1].substring(2, 6));
		System.out.println("------");
		System.out.println("Concat String "+str1[0].concat(str1[7]));
		System.out.println("-----");
		System.out.println("Find Index of "+str1[3].indexOf("a"));
		System.out.println("-----");
		System.out.println("Find Index of "+str1[3].lastIndexOf("a"));
		System.out.println("-----");
		System.out.println("Replace Hi! ->"+str1[8].replace("Hi!", "World!"));
	}
	

}

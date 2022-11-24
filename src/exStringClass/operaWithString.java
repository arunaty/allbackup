package exStringClass;
abstract public class operaWithString 
{
	String [] str1= {"Lakhan","Lakhan","LAKHAN","lakhan","Amravati","khan","","Adewar","Hello Hi!"};
	// 0 1
	abstract public void operaOne();//abstract method 1
	
	abstract public void operaThree();//abstract method 2
	
public void operaTwo()
{
	//operation to equals the String with other string(Result:True/False)
System.out.println("First String With Second: "+(str1[0].equals(str1[1])));System.out.println("-----");
System.out.println("First String With Third: "+(str1[0].equals(str1[2])));System.out.println("-----");//1st with 3rd
//now ignore the casesesitiveness 
System.out.println("First String With Third without Case Sensitive: "+(str1[0].equalsIgnoreCase(str1[2])));System.out.println("-----");
//operation to perfom the check contain sequence of character
System.out.println("Contain The sequence of Character: "+(str1[1].contains(str1[5])));System.out.println("-----");
System.out.println("-------xxxxx-------");
System.out.println("Is Emplty Checking "+(str1[6].isEmpty()));System.out.println("-----");
System.out.println("-------xxxxx-------");
for(int i=0;i<=str1[2].length()-1;i++)
{
System.out.println("Index "+(i+1)+" "+(str1[2].charAt(i)));
}

}}
	


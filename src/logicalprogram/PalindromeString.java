package logicalprogram;

public class PalindromeString 
{
	public static void main(String[] args)
		{
		
		String name="1512";
		String revname="";
				
		for (int i=name.length()-1;i>=0;i--)
		{	
			revname=revname+name.charAt(i);	
		}
		
		if(name.equalsIgnoreCase(revname))
		{
			System.out.println("Yes! its a Palindrome");
		}else
		{
			System.out.println("Sorry! its Not Palindrome");
		}
		
		
		
		}
	}

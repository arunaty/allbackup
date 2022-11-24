package logicalprogram;

public class ArrangeWordinRev 
{

	public static void main(String[] args)
	{
		String sent="I Love My India";
		
		String[] sentsplit=sent.split(" ");
		
		for(int i=sentsplit.length-1;i>=0;i--)
		{
			
			System.out.print(sentsplit[i]+" ");
		}
		System.out.println("\n-----------");
		
		for( int j=sent.length()-1;j>=0;j--)
		{
			
			System.out.print(sent.charAt(j));
			
		}
		
		
		
		
	}
}

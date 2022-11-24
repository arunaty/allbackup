package logicalprogram;

public class NoOfSpaces {

	public static void main(String[] args) {
		
		String para="l a k h a n s u b h a s h a d e w a r";
		
		int space=0;
		char x=' ';
		
		for(int i=0;i<=para.length()-1;i++)
		{
			x=para.charAt(i);//l
			//l
			if(x==' ')
			{
				space++;
			}
//			else
//			{
//				System.out.print(x);
//			}
			
			
		}
		
		System.out.println("No of Spaces in Para are "+space);
		
		
		
		
	}
	
	
}

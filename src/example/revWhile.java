package example;

public class revWhile {

	public static void main(String[] args) {
		
		
		revWhile a1=new revWhile();
		a1.usewhile();
	}
	
	public void usewhile()
	{
		
		int i=1000;
		int y=0;
		
		while(i>=900)
		{
			y=i%2;
			
			if(y!=0)
			{
				System.out.println(i);
			}
			i--;
			
			
		}
		
		
		
//		do
//		{
//			y=i%2;//check whether no is odd or not
//			
//			
//			if(y!=0)
//			{
//				System.out.println(i);
//			}
//			
//			//System.out.println(i);
//			
//			i--;
//			
//		}while(i>=900);
		
		
		
	}
	
}

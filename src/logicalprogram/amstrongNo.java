package logicalprogram;

public class amstrongNo {

	public static void main(String[] args) {
		
		int no=371;
		int sum=0;
			
		int n=no;
		
		do
		{			int rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;	
			
		}while(n>0);
		
		if(no==sum)
		{
			System.out.println("Yes! its a Amstrong Number");
		}else
		{
			System.out.println("Sorry! it Not");
		}
//		for(int i=no;i>0;i=i/10)
//		{
//			int rem=i%10;
//			sum=sum+(rem*rem*rem);			
//			
//		}
		

	}

}

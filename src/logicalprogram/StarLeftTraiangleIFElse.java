package logicalprogram;

public class StarLeftTraiangleIFElse {

public static void main(String[] args) {

		
	//int star=1;
	//int space=4;
	for(int row=1;row<=5;row++)
	{
		for(int col=1;col<=5;col++)
		{
			if(col>=(6-row))
			{
				System.out.print("*");
			}else
			{
				System.out.print(" ");
			}	
		}
		//space--;
		System.out.println();				
	}
	
	
	
		
	}	
}

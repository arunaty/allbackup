package Tasks;

public class pyramidPrint {

//	 	*
//	   ***
//	  *****
//	 *******
//	*********
	
	public static void main(String[] args) {
		
		int star=1;
		int space=4;
	for(int row=1;row<=9;row=row+2)//it will print 5 rows
	{
		
		for(int i=1;i<=space;i++)
		{
			System.out.print(" ");
		}
		for(int col=1;col<=row;col++)
		{
			System.out.print("*");
		}
		space--;
		System.out.println();
		
		
		
		
		
	}
	
	}}

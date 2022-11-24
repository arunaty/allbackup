package logicalprogram;

public class FebonicSeries {

	public static void main(String[] args) {


		int n1=0,n2=1,n3,no=10;
		
		for(int i=0;i<=no;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+"\t");
				
		}
		
		
		

	}

}

package logicalprogram;

public class NumbersMax {
	
	public static void main(String[] args) {
		
		float[][] itr= {{94,36,986},{111,980,564},{876,9143,854}};
		
		float max=0;
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
		float maxint=itr[i][j];
		
		if(maxint>max)
		{
			max=maxint;
		}
				
		}}
		System.out.println("Largest No: "+max);
		System.out.println(itr[0][1]);
		
		
		
		
		
	}
	

}

package exArrays;

public class ExImpleClass implements ExInterface
{

	
	public void useIntArray()
	{
		System.out.println("-----One dimenstional Array Declaration----");
		System.out.println("Syntax: int[] arrayName=new int[SizeOfArray]");
		
		int[] intar1=new int[5];//declaration of array
		int[] intar2= {21,32,43,54,65};//array declaration and initialization  
		
		//array first name: intar1 initilization 
		intar1[0]=12;
		intar1[1]=23;
		intar1[2]=34;
		intar1[3]=45;
		intar1[4]=56;
		//finding the size of arrays
		System.out.println("Size of integer Array Name intar1="+(intar1.length));
		System.out.println("Size of integer Array Name intar2="+(intar2.length));
		//usage using for loop
		System.out.println("-Showing the operation performed on Integer Array-");
	
		for(int i=0;i<=intar1.length-1;i++)
		{
		
		System.out.println("Addition of "+(i+1)+" Numbers: "+(intar1[i]+intar2[i]));
		}
		}	
	
	public void useStrArray()
		{
			String[] str1=new String[5];//String array declaration
			String[] str2= {"Lakhan","Manmohan","Shubham","Mahesh","Nikhil"};
			
			//String Array str1 initiallization
			str1[0]="Adewar";
			str1[1]="Singh";
			str1[2]="Adewar";
			str1[3]="Jadhav";
			str1[4]="Kashid";
			
			System.out.println("Size of String Array Name str1="+(str1.length));
			System.out.println("Size of String Array Name str2="+(str2.length));
			System.out.println("-Showing The Operation Performend on String Array-");
			//usage for loop
			
			for(int i=0;i<=str1.length-1;i++)//0 1 2 3 4 
			{
				System.out.println("Name of "+(i+1)+" Student: "+str2[i]+" "+str1[i]);
			}			
			
		}		
}

package logicalprogram;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
//		prime no is a no which is divisable by one and it self only
		
		Scanner scan=new Scanner(System.in);
		
		for(;;)
		{
		
		int no=scan.nextInt();
		
		//int no=11;
		int count=0;
		
		
		for(int i=1;i<=no;i++)
		{
						
			if(no%i==0)//true
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println(no+" is Prime!"+count);
		}
		else
		{
			System.out.println(no+" is Not Prime, and it can be divided by "+count+" this numbers");
		}
		
		}
		}
	}
		
		
		

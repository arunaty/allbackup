package Tasks;
import java.util.*;
public class scannerex {
	
public static void main(String[] args) 
	{
		Scanner no=new Scanner(System.in);
		System.out.print("\nEnter a Value to Print Table:\t");
	int i=no.nextInt();
		do {
			System.out.print("Table of "+i+":\t");
			for(int a=1;a<=10;a++) 
				{
				System.out.print(a*i+"\t");
				}	
			System.out.print("\nEnter a Value to Print Table:\t");
			i=no.nextInt();		
		}while(i<=9999 && i>=0);
	
	}}

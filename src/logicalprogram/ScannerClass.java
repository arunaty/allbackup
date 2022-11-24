package logicalprogram;

import java.util.Scanner;

public class ScannerClass 
{

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int no[]= new int[3];
		
		String name1;
		String name2;
		System.out.println("Enter no One: ");
		no[0]=scan.nextInt();
		System.out.println("Enter no Two: ");
		no[1]=scan.nextInt();
		
		no[2]=(no[0]+no[1]);
		System.out.println("Addition of Two No. : "+no[2]);
		System.out.println("Enter First Name : ");
		name1=scan.next();
		System.out.println("Enter Last Name: ");
		name2=scan.next();
		
		System.out.println("Name from Input: "+name1.concat(" "+name2));
		
		System.out.println(name1.startsWith("lak"));
		System.out.println(name1.contains("han"));
		
		
		
	}
	
	
	
}

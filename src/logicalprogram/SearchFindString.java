package logicalprogram;

public class SearchFindString {

	public static void main(String[] args) {
		
		String[] str1= {"Lakhan","Nilesh","Lakhan Adewar","Snehal","Rashmi","Harsha","Shrutika","Jagdish","Hemant Itnare","Automation by Swapnil Sir"};
		
		int MaxStringLength = 0;
	    String MaxCharString = null;
	    	    
		for(int i=0;i<=str1.length-1;i++)//string index to be constant
				{
			int max1=str1[i].length();//13
			if(max1>MaxStringLength)//block true
			{
				MaxStringLength=max1;//13 integer
				
				MaxCharString = str1[i];// string Lakhan Adewar
			}}//return longestString;
	System.out.println("Longest String : \n"+ MaxCharString+" \nChar in String are :"+MaxStringLength);
	
	}}
		
			


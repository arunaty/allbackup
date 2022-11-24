package example;

import java.util.Arrays;

public class largestno 
{
public static void main(String[] args) {
	
	//int[] no=new int[5]; integer array with capacity
	
	int[] no= {99,31,47,45,1089,9867,5746,86868,23434,23423432,2344367,242343245,8677835,123346};
	
	Arrays.sort(no);
			
	System.out.println("Second Smallest no is "+no[1]);
	System.out.println("Second Largest no is "+no[(no.length-2)]);
	
	
}}

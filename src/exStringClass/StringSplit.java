package exStringClass;

public class StringSplit {

	public static void main(String[] args) {
		String names="Lakhan,Harshad,Shubham,Mahesh,Nikhil";
		
		String[] sep= names.split(",");
		
		for(int i=0;i<=sep.length-1;i++)
		{
			System.out.println(sep[i]);
		}
	}
}

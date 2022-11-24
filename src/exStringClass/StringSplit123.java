package exStringClass;

public class StringSplit123 {

	public static void main(String[] args) {

		String StdName="Snehal.Lakhan.Nilesh.Shrutika.Harsha.Rashmi";
				
		String[] SplName= StdName.split("\\.");

		
		for(int i=0;i<=SplName.length-1;i++)
		{
			System.out.println(SplName[i]);
		}
		
	}

}

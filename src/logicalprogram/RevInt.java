package logicalprogram;

public class RevInt {

	public static void main(String[] args) {

		int no=1994;
		
		String rev= Integer.toString(no);
		
		String revno="";
		
		for(int i=rev.length()-1;i>=0;i--)
		{
			revno=revno+rev.charAt(i);
		}
		
		int revno1= Integer.parseInt(revno);
		
		System.out.println(revno1);

	}

}

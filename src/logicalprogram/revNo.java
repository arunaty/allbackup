package logicalprogram;

public class revNo {
	public static void main(String[] args) {
		
		int orgNo=1234;
		
		String revStr1= Integer.toString(orgNo);
		String revStr2="";
		
		for(int i=revStr1.length()-1;i>=0;i--)
		{
			revStr2=revStr2+revStr1.charAt(i);
			
		}
		
		int revno=Integer.parseInt(revStr2); 
		System.out.println(revno);
			
		
		
		
		
		
		
		
	}
}

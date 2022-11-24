package StreamApiJava8;

import java.util.ArrayList;

public class Countnamewithstsring2 {

	public static void main(String[] args) {
		int count = 0;

		ArrayList<String> name = new ArrayList<String>();
		name.add("lakhan");
		name.add("Abhi");
		name.add("Anuradha");
		name.add("Anna");
		name.add("Snehal");
	
		long x=name.stream().filter(sr->sr.startsWith("A")).count();
		
		System.out.println(x);
	}
}

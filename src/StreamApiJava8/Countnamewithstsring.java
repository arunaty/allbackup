package StreamApiJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Countnamewithstsring {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("lakhan");
		name.add("Abhi");
		name.add("Anuradha");
		name.add("Anna");
		name.add("Snehal");
	// to filter a string a get a count with a name start with charater "A"
	//	long x=name.stream().filter(sr->sr.startsWith("A")).count();
	//	System.out.println(x);
		String[] lnm= {"Adithi","Althaf","Amoghavarsha","Arundhati Chandan","Chethan","Chiranth","Dhanush","Disha","Diya Subbaiah","Gayathri","Goutham","Gowtham","Harish","Harshith"};
		
	List<String> name1=Arrays.asList(lnm);	
		
	//name1.stream().filter(s->s.length()<=6).forEach(s->System.out.println(s));	
		
//	name1.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));	
	
	// to join to arraylist 
	
	
	Stream<String> newStream=Stream.concat(name.stream(),name1.stream());
	
	newStream.forEach(s->System.out.println(s));
	
	
	}
}

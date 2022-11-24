package logicalprogram;

public class replacespecialcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "M@adh$uma&ti7635";

		String alphaOnly = name.replaceAll("[^A-Za-z]+", "");

		System.out.println(alphaOnly);

		String nm = "m4o4n3877a4l4i";

		String str = nm.replaceAll("[^a-zA-Z]", "");
		System.out.println(str);
	}

}

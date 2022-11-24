package Tasks;

public class exmainclass {

	public static void main(String[] args) {
		//called all the static and nonstatic method in main class
		othermeth menm=new othermeth();
		System.out.println("Table of 21:");
		othermeth.tablemet();
		System.out.println("Ex of if Else:");
		menm.useifelse();
		System.out.println("Ex of Ladder:");
		menm.useifelseladder();
		System.out.println("Ex of nested if:");
		menm.usenested();
		System.out.println("Ex of if while:");
		menm.usewhile();
	}}

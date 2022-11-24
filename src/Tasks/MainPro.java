package Tasks;

public class MainPro {
	public static void main(String[] args) {
		System.out.println("table of 1 to 100");
		table9();
		System.out.println("\ntable of 18");
		othertable.table18(18);
		System.out.println("\ntable of 23");
		othertable objnon=new othertable();
		objnon.table23();
	}
	
	public static void table9()
	{
		for(int x=1;x<=10;x++)
				{
			for(int y=1;y<=100;y++)
			{
			System.out.print(x*y+"\t");
		}
			System.out.println("\n");}
			}
	
}

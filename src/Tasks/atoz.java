package Tasks;

public class atoz {
	
	public int x;
	public static int y;

	public atoz() {
		x= 0;
		y = 0;
	}

	public void display() {
	    System.out.println(x+" "+y);
	}
	
	
	public static void main(String[] args) {
	   atoz m  =new atoz();
	   m.display();
	   System.out.println(m.x);
	}
}

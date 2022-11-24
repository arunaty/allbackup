package Tasks;

public class nonstaticpara1 {
public static void main(String[] args) {
	nonstaticpara1 z=new nonstaticpara1();
	z.m1(43.2f, 543.2);
	nonstaticpara2 w=new nonstaticpara2();
	w.m2(2,4);
}
public void m1(float f, double d)
{
System.out.println((f/d));	
}
}

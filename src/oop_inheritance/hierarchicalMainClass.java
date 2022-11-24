package oop_inheritance;

public class hierarchicalMainClass {
	public static void main(String[] args)
		{
			hierarchicalSubClass1 cl1=new hierarchicalSubClass1();
			System.out.println("SubClass 1 Inheriated the Properties of Parent Class");
					
			cl1.circleuse(5);
			cl1.douseaz('Z');
			cl1.evenOdd(8);
			cl1.trifind(60, 60, 60);
			cl1.useswitch(4);
			cl1.usewhile(8);
			System.out.println("subClass 1 Property");
			cl1.useifelse(12, 8, 7);
					
			
			
			hierarchicalSubClass2 cl2=new hierarchicalSubClass2();
			System.out.println("SubClass 2 Inheriated the Properties of Parent Class");
			cl2.circleuse(5);
			cl2.douseaz('Z');
			cl2.evenOdd(8);
			cl2.trifind(60, 60, 60);
			cl2.useswitch(4);
			cl2.usewhile(8);
			System.out.println("subClass 2 Property");
			cl2.usenested();
			
			
			
			hierarchicalSubClass3 cl3=new hierarchicalSubClass3();
			System.out.println("SubClass 3 Inheriated the Properties of Parent Class");
			cl3.circleuse(5);
			cl3.douseaz('Z');
			cl3.evenOdd(8);
			cl3.trifind(60, 60, 60);
			cl3.useswitch(4);
			cl3.usewhile(8);
			System.out.println("subClass 2 Property");
			cl3.usedowhile(4);
			
		}
	}

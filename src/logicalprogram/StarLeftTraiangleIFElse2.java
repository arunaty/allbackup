package logicalprogram;

public class StarLeftTraiangleIFElse2 {

public static void main(String[] args) {

		
		for(int i=1 ;i<=5 ;i++) {  //Row    //1<=5True  //Outerforloo
			                                //2<=5 True
			                                 //3<=5 - True
			                                //6<=5  - false
			for(int j=1;j<=5;j++) {     //1<=5  True   6<=5  - false  /innerforloop
				// 1<=5 -- True
				 //6<=5  -false
				 //  1<=2   - True
				 //  2<=2   - True
				 //  3<=2  -  false
				if(j<=i) {    //1<=1   -  True          1<=3  - True    *  
					          //2<=1   -  False         2<=3  - True     
					          // 5<=1   -  false        3<=3  - True
					                               //   4<=3  -  false
					                                //    5<=3   -false
					System.out.print(" *");     //  					                           //* *   
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
	}	
}

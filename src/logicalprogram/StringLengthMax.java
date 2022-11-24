package logicalprogram;

public class StringLengthMax {

	public static void main(String[] args) {

		
		String para="Definition: Software engineering is a detailed study of engineering to the design, development and maintenance of software. Software engineering was introduced to address the issues of low-quality software projects. Problems arise when a software generally exceeds timelines, budgets, and reduced levels of quality. It ensures that the application is built consistently, correctly, on time and on budget and within requirements. The demand of software engineering also emerged to cater to the immense rate of change in user requirements and environment on which application is supposed to be working. Description: A software product is judged by how easily it can be used by the end-user and the features it offers to the user. An application must score in the following areas:- 1) Operational: -This tells how good a software works on operations like budget , usability, efficiency, correctness ,functionality , dependability , security and safety. 2) Transitional: - Transitional is important when an application is shifted from one platform to another. So, portability, reusability and adaptability come in this area. 3) Maintenance: - This specifies how good a software works in the changing environment. Modularity, maintainability, flexibility and scalability come in maintenance part.";
		
		String [] names=para.split("\\s");
		
		//String[] names= {"Harshad Pune","Lakhan Amra","Monali Nagpur","Madhumati Pune"};
		
		String mx="";//max string
		int mx1=0;//no of character in max string
						//4<4			//4
		for(int i=0;i<names.length;i++)
		{			//    3
			int mx2=names[i].length();//14
			  //14>13
			if(mx2>mx1)//true
			{			//0
				mx=names[i];//Madhumati Pune
				mx1=mx2;//14
			}
		
			
		}
		System.out.println("This is String has Max Chracter in it <"+mx+"> with this no of char<"+mx1+">");
		
		

	}

}

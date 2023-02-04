package loops_pratice;

public class WhileLoopStudy {

	public static void main(String[] args)
	{
		// i want print hello 3 times
		
	//  start at-->0   end at-->2  updation-->a++
		
		int a=0;//1. initialization
		
		while(a<=2)//2.condition
		{
			// body of loop
			System.out.println("hello");
	
			a++;//3.updation
		}
		System.out.println("=============");
		// i want to print table of 5
		// start at-->5  end at-->50 updation-->b=b+5
		
		
		
		 int b=5;//1.initialization
		 while(b<=50)//2.condition
		 {
			 
			 // body of loop
			 System.out.println(b);
			 
			 // 3.updation
			 b=b+5;
		 }

		 System.out.println("=====================");
		 
		 // i want  to  print table of 5 in reverse
		//  start at-->50  end at-->5  updation-->c=c-5
		 int c=50;
		 while(c>=5)//3.condition
			 
		 {
			 System.out.println(c);
			 
			 c=c-5;
		 }
		 System.out.println("============================");
		 // i want to print table of 10
		 
		 int d=10;
		 while(d<=100)//4.condition
		 {
			 System.out.println(d); 
			 d=d+10;
		 }
		 System.out.println("===========================");
		 
		 
         
	}

}

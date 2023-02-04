package constructructorprogram_practicetest1;

public class CC_1 {

   //   public CC1()
   //  {
	//     default constructor---> compiler
       
        
	    int a;// variable a is declared
	    int b;// variable b is declared
	     
	      public CC_1 ()// user defined constructor---> zero parameter
	      {
	    	  System.out.println("==========================================");
	    	 System.out.println("hi user defined constructor is runing");
	    	 a=100;// variables are initialized in constructor 
	    	b=150;//variables are initialized in constructor
	    	
	      }	
	    	  
	
	
	
	
	
	
	public static void main(String[] args)
	{
		CC_1 c1=new CC_1();// the  constructor is called when an object of a class is created.
		c1.addtion();
		c1.multiplication();

		
		
          

	}
	     public void addtion()
	     {
	    	 int a= 10;// variables are initialized by user
	    	 int b= 20;// variables are initialized by user
	    	 int sum=a+b;
	    	 System.out.println("=============================");
	    	 System.out.println("sum is "+sum);
	    	 
	     }
	     public void multiplication()
	     {
	    	 int mul=a*b;
	    	 System.out.println(" multiplication is "+mul);
	    	 System.out.println("==================================");
	    	 
	     }

}

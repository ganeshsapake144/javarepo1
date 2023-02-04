package constructructorprogram_practicetest1;

public class Test
{
     int x;//global variable x declared
     int y;//global variable y declared
     
     public Test()//user defined zero parameter constructor
     {
    	//use of constructor to initialize data member/variable
    	 x=8;
    	 y=9;
    	 System.out.println("================================");
    	 System.out.println("value of x by constructor is "+x);
    	 System.out.println("value of y by constructor is "+y);
    	 
    			 
    	 
     }
     
     

	public static void main(String[] args)
	{
		Test t= new Test();
		t.addition();


	}
	 public void addition()
	 {
		 x=10;
		 y=11;
		 int sum=x+y;
		 System.out.println("=====================");
		 System.out.println("now value of x is "+x);
		 System.out.println("now value of y is "+y);
		 System.out.println("=====================");
	 }

}

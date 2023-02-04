package constructructorprogram_practicetest1;

public class constructructorprogram2 {
         int x;
         int y;
	public  constructructorprogram2()
	{
	//	x=100;
	//  y=200;
		System.out.println("=====================");
		System.out.println("the value of x is "+x);
		System.out.println("the value of y is "+y);
		System.out.println("=====================");
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		constructructorprogram2 G2= new constructructorprogram2();
		G2.addition();
	

	}
	  public void addition()
	  { //x=500;
		//y=500;
	   int add=x+y;
	   System.out.println("the addition is "+add );
		  
	  }

}

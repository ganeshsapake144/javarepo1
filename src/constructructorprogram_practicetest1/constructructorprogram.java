package constructructorprogram_practicetest1;

public class constructructorprogram {
        int x;
        int y;
        public constructructorprogram()
        {
        	x=50;
        	y=30;
        	System.out.println("=====================");
        	System.out.println("the value of x is "+x);
        	System.out.println("the value of y is "+y);
        	System.out.println("=====================");
        	
        }
	
	
	
	public static void main(String[] args) 
	{
		constructructorprogram g1= new constructructorprogram();
		g1.multiplication();


	}
	  public void multiplication()
	  {  //x=65;
		 //y=74;
		  int mul=x*y;
	
		  System.out.println("the multiplication is "+mul);
		  System.out.println("===========================");
		  
		  
	  }

}

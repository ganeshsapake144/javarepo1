package constructorStudy;

public class CC {

	
//	public CC()
//	{
//		Default constructor---> provided by compiler
//	}
	
	  public void CC()// user defined zero parameter constructor/without parameter constructor
	  {
		  System.out.println("Hi constructor is running");
		  
	  }
	  public void test()
      {
    	  System.out.println("Test method is running");
      }
	
	
	
	
	public static void main(String[] args) 
	{
	// CC c= new CC();// created object of class	
    CC g=new CC();
    g.CC();
    g.test();
	}
    
}

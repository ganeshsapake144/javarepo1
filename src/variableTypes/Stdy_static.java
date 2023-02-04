package variableTypes;

public class Stdy_static {

	 
	static int a=40;// static global variable
	
	
	public static void main(String[] args)
	{
		Stdy_static s=new Stdy_static();
		s.display();
		
		System.out.println("value of a is "+a);//calling static global variable from same class
	     System.out.println("value of p is "+ Stdy_static1.p);// calling static global variable from another class

	}
	  public void display()
	  {
		  int b=30;
		  System.out.println("value of b is "+b);// local variable
		  System.out.println("value of a is "+a);
		 
          System.out.println("=========================");  
		  
	  }

}

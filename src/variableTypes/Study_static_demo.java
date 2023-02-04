package variableTypes;

public class Study_static_demo {

	  static int a=40;// static global variable
	
	public static void main(String[] args) 
	{
		 Study_static_demo g=new  Study_static_demo();
		 g.display();
		 System.out.println("value of a is "+a);//calling static global variable from same class
		 System.out.println("value p is "+ Stdy_static1 .p);


	}
	  public void display()
	  {
		  int b=30;
		  
		  System.out.println("value of b is "+b);//global variable
		  System.out.println("value of a is "+a);//static global variable
		  
	  }

}

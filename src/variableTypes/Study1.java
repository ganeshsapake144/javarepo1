package variableTypes;

public class Study1 {
     
	int a=20;// Non static global variable
	
	public static void main(String[] args)
	{
		 Study1 s=new  Study1();
		 s.display();
		 s.display1();
		 System.out.println("value of after calling is "+s.a);//calling Non static global variable from same class
		 System.out.println("==================================");
		 Study2 s2= new  Study2 ();
		 
	

	}
	    public void display()
	    {
	    	int b=30;//local variable
	    	System.out.println("======================================");
	    	System.out.println("value of b is "+b);// value of b will be 30 for display method only
	    	System.out.println("value of a is "+a);//value of a will be 20 for all 
	    }
	    public void display1()
	    {
	    	int c=40;//local variable
	    	int b=50;
	    	System.out.println("===============================");
	    	System.out.println("value of b is "+b);
	    	System.out.println("value of c is "+c);
	    	System.out.println("value of a is "+a);
	    	
	    }
	    
	    

}

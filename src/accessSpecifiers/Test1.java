package accessSpecifiers;

public class Test1 {

	public static void main(String[] args) 
	{
	  // to call non static methods/global variable from test class-->need to create object of test class
		
		Test t=new Test();//created object of another [test] class
		
		// t.demo1();//cant call private method from another class
		 t.demo2();//calling default method from another class in same package
		 t.demo3();// calling protected method from another class in same package
		 t.demo4();//calling public method from another class in same package
		 
		// System.out.println("calling private global variable form another class "+t.a);// cant call private variable from another class
		 
		 System.out.println("calling default global variable from another class in same package "+t.b);
		 System.out.println("calling protected global variable form another class in same package "+t.c);
		 System.out.println("calling public global variable form another class in same package "+t.d);
		  
		 // created in another package
		 
		 

	}

}

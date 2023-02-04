package interfaceStudy;

public class Test {

	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);
		a=a+9;
		System.out.println(a);
		a=a+100;
		System.out.println(a);
		
		
		final int b=20;//we cant reassgn/ update the value of final variable
		System.out.println(b);
		//b=b+10;

	}
      public final void demo()
      {
    	  System.out.println("Hi I am demo method from test class");
    	  
      }
}

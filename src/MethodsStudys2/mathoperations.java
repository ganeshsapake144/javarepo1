package MethodsStudys2;

public class mathoperations
{
	  public void addition()
	  {
		int a=30;
		int b=40;
		
		int sum=a+b;
		System.out.println("*****non static method from different class*****");
		System.out.println("addition is: "+sum);
		System.out.println("*************************************************");
		
		  
	  }

	public static void main(String[] args)
	{
		int a= 500;
		float b=420.20f;
		
		float sub= a-b;
		 
		System.out.println("*****static method from different class*****");
		System.out.println("substraction is :"+sub);
		System.out.println("**********************************************");
		
	}

}

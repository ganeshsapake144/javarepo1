package methods;

import method_study.Sample1;

public class Sample4 {

	public static void main(String[] args)
	{
	//3.non-static method call from same class
		System.out.println("main method started");
		
		//1.create object of class
		//className objectName/reference Variable=new className();
		
		//sample4 s4=new sample4();
		
		Sample1 s4=new Sample1();
		s4.m1();//objectName.methodName();
		
		s4.m2();
		System.out.println("main method ended");
		
		

	}
	//non-static regular method
	public void m2()
	{
		System.out.println("running non-static regular method:m2");
		
	}

}

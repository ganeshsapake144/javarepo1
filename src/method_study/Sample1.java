package method_study;

import MethodsStudys2.sample;

public class Sample1 {

	public static void main(String[] args) 
	{
		System.out.println("main method from sample1");
		demo1();//static method from same class
		//demo2();
		//classname.methodname-->to call static method from another class
		sample.demo();//calling static method demo1()from sample class
		
		

	}
	
	public static void demo2()//defining static method 
	{
		System.out.println("hi i am demo2 from sample1");
		
	}
	public static void demo1()//defining static method 
	{
		System.out.println("hi i am demo1 from sample1");
	}

	public void m1() {
		// TODO Auto-generated method stub
		
	}

	public void m2() {
		// TODO Auto-generated method stub
		
	}

}

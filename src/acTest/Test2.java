package acTest;

import accessSpecifiers.Test;

public class Test2 extends Test {

	
	public static void main(String[] args) 
	{
		Test t=new Test();
		
		//t.demo1();//cant call private method from any class
		//t.demo2();//cant call default method from another package
		//t.demo3();//cant call protected method from another package ,without inheritance operation
		t.demo4();//calling public method from another package 
		
		//to call protected methods or variables,create object of sub class
		Test2 t2=new Test2();//created object of subclass
		
		t2.demo3();//calling protected method from another package 
		t2.demo4();// calling public method from another package 
		
		

	}

}

package this_Super_use;

public class B extends A 
{ 

	int a=500;//global variable of class B
	
	
	
	public static void main(String[] args)
	{
		B b=new B();
		b.display();
		

	}
	public void display()
	{
		int a=200;//local variable
		
		System.out.println("local value of a "+a);//calling local value
		System.out.println("global value of a from same class is "+this. a);//calling global value global value of same class
		System.out.println("global value of a from super class is "+super.a);
		
	}

}

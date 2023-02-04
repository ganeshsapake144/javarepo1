package accessSpecifiers;

public class Test {

	private int a=10;//private--> visible only within class
	int b=20;//default-->visible only within package 
	protected int c=30;//protected-->visible only within package, using inheritance can be used outside of package
	public int d=40;//public-->visible thought out the project 
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
	

	}
	private void demo1()
	{
		System.out.println("Demo1 private method");
		
	}
	void demo2()
	{
		System.out.println("Demo2 default method");
		
	}
	protected void demo3()
	{
		System.out.println("Demo3 protected method");
		
	}
	public void demo4() 
	{
		System.out.println("Demo4 public method");
		
	}
		
	

}

package abstractClass;

public class CC extends Test
   {

	public static void main(String[] args) 
	{
       CC c=new CC();//created object of concrete class
       
       c.demo1();
       c.demo2();
       c.demo3();// calling method from concrete class
       

	}
	public void demo3() 
	{
		System.out.println("demo3 is completed in concrete class");
	}

}

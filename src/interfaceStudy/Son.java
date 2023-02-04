package interfaceStudy;

public class Son implements Father,Mother
{
    
     {
	}
	public static void main(String[] args)
	{
	   Son s=new Son();
	   s.love();//calling mothers methods
	   s.cooking();//calling mothers methods
	   System.out.println("==============================");
	   s.money();//calling fathers methods
	   s.nature();//calling fathers methods
	   System.out.println("==============================");
	   s.bike();// calling own methods
	   System.out.println("==============================");
	   
	   s.test();
	   System.out.println("==============================");
	   Father.demo();//calling static methods from father interface
	   Mother.demo();//calling static methods from mother interface
	   
	}
	

	@Override
	public void love() 
	{
	System.out.println("Mothers love implemented by son");
		
	}

	@Override
	public void cooking() 
	{
		System.out.println("Mothers cooking implemented by son");
		
	}

	@Override
	public void money()
	{
		System.out.println("Fathers money implemented by son");
		
	}

	@Override
	public void nature() 
	{
		System.out.println("Fathers nature implemented by son");
		
	}
	public void bike()
	{
		System.out.println("Sons own bike methods");
		
	}

	@Override
	public void test() {
		
		Father.super.test();//calling default method from mother interface
		Mother.super.test();//calling default method from mother interface
		
		
	}

}
